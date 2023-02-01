#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};

struct Node *createNode(int data)
{
    struct Node *n;
    n = (struct Node *)malloc(sizeof(struct Node));
    n->data = data;
    n->left = NULL;
    n->right = NULL;
}

void Preorder(struct Node *root)
{
    if (root != NULL)
    {
        printf("%d ", root->data);
        Preorder(root->left);
        Preorder(root->right);
    }
}

int main()
{
    struct Node *root = createNode(4);
    struct Node *C1 = createNode(1);
    struct Node *C2 = createNode(6);
    struct Node *C3 = createNode(5);
    struct Node *C4 = createNode(2);

    root->left = C1;
    root->right = C2;
    C1->left = C3;
    C1->right = C4;

    Preorder(root);
    return 0;
}