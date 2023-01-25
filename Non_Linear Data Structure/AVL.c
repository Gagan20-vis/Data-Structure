#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
    int height;
};

int getHeight(struct Node *n)
{
    if (n == NULL)
        return 0;
    return n->height;
}

struct Node *createNode(int key)
{
    struct Node *root;
    root = (struct Node *)malloc(sizeof(struct Node));
    root->left = NULL;
    root->right = NULL;
    root->height = 1;
}

int getBalanceFactor(struct Node *n)
{
    if (n == NULL)
        return 0;
    return getHeight(n->left->height) - getHeight(n->right->height);
}

struct Node *leftRotate(struct Node *y)
{
    struct Node *x = y->left;
    struct Node *T2 = x->right;

    x->right = y;
    y->left = T2;

    y->height = max(getHeight(y->right), getHeight(y->left)) + 1;
    x->height = max(getHeight(x->right), getHeight(x->left)) + 1;
    return x;
}

struct Node *rightRotate(struct Node *x)
{
    struct Node *y = x->right;
    struct Node *T2 = x->left;

    y->left = x;
    x->right = T2;

    y->height = max(getHeight(y->right), getHeight(y->left)) + 1;
    x->height = max(getHeight(x->right), getHeight(x->left)) + 1;
    return x;
}

int main()
{
    struct Node *p = createNode();

    return 0;
}

//To be Continued.....