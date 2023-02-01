#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};

struct Node *createnode(int data)
{
    struct Node *root;
    root = (struct Node *)malloc(sizeof(struct Node));
    root->data = data;
    root->left = NULL;
    root->right = NULL;
    return root;
}

void Inorder(struct Node *ptr)
{
    if (ptr != NULL)
    {
        Inorder(ptr->left);
        printf("%d ", ptr->data);
        Inorder(ptr->right);
    }
}

struct Node *inOrderPredecessor(struct Node *root)
{
    root = root->left;
    while (root->right != NULL)
        root = root->right;
    return root;
}

struct Node *Delete(struct Node *root, int value)
{
    struct Node *iPre;
    if (root == NULL)
        return NULL;
    if (root->left == NULL && root->right == NULL)
    {
        free(root);
        return NULL;
    }
    if (value < root->data)
        root->left = Delete(root->left, value);
    else if (value > root->data)
        root->right = Delete(root->right, value);
    else
    {
        iPre = inOrderPredecessor(root);
        root->data = iPre->data;
        root->left = Delete(root->left, iPre->data);
    }
    return root;
}

int main()
{
    struct Node *p = createnode(5);
    struct Node *p1 = createnode(3);
    struct Node *p2 = createnode(6);
    struct Node *p3 = createnode(1);
    struct Node *p4 = createnode(4);

    p->left = p1;
    p->right = p2;
    p1->left = p3;
    p1->right = p4;

    Inorder(p);
    Delete(p, 6);
    printf("\n");
    Inorder(p);
    return 0;
}