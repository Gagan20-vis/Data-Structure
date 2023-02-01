#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};

struct Node * createNode(int data)
{
    struct Node *n;
    n = (struct Node *)malloc(sizeof(struct Node));
    n->data = data;
    n->left = NULL;
    n->right = NULL;
}

int main()
{
    struct Node * root = createNode(2);
    struct Node * C1 = createNode(4);
    struct Node * C2 = createNode(7);
    root->left = C1;
    root->right = C2;
    return 0;
}