#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};

int Postorder(struct Node *root)
{
    if (root != NULL)
    {
        Postorder(root->left);
        Postorder(root->right);
        printf("%d ", root->data);
    }
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
    struct Node *root = createNode(4);
    struct Node *C1 = createNode(1);
    struct Node *C2 = createNode(6);
    struct Node *C3 = createNode(5);
    struct Node *C4 = createNode(2);

    root->left = C1;
    root->right = C2;
    C1->left = C3;
    C1->right = C4;

    Postorder(root);
    return 0;
}