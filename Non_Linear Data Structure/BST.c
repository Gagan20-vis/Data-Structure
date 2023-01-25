#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};

void Inorder(struct Node *root)
{
    if (root != NULL)
    {
        Inorder(root->left);
        printf("%d ", root->data);
        Inorder(root->right);
    }
}

int isBST(struct Node *root)
{
    static struct Node *prev = NULL;
    if (root != NULL)
    {
        if (!isBST(root->left))
            return 0;
        if (prev != NULL && root->data <= prev->data)
            return 0;
        prev = root;
        return isBST(root->right);
    }
    else
        return 1;
}

struct Node *createNode(int data)
{
    struct Node *p;
    p = (struct Node *)malloc(sizeof(struct Node));
    p->data = data;
    p->left = NULL;
    p->right = NULL;
}

int main()
{
    struct Node *root = createNode(5);
    struct Node *C1 = createNode(3);
    struct Node *C2 = createNode(6);
    struct Node *C3 = createNode(1);
    struct Node *C4 = createNode(4);

    root->left = C1;
    root->right = C2;
    C1->left = C3;
    C1->right = C4;

    Inorder(root);
    printf("\n");
    printf("%d",isBST(root));
    return 0;
}