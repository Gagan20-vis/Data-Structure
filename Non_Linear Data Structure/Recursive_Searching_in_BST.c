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
    struct Node *root;
    root = (struct Node *)malloc(sizeof(struct Node));
    root->data = data;
    root->left = NULL;
    root->right = NULL;
}

int isBST(struct Node *root)
{
    struct Node *prev = NULL;
    if (root != NULL)
    {
        if (!isBST(root->left))
        {
            return 0;
        }
        if (prev != NULL && root->data <= prev->data)
        {
            return 0;
        }
        prev = root;
        return isBST(root->right);
    }
    else
        return 1;
}

struct Node * BinarySearch(struct Node *root, int data)
{
    if (root == NULL)
        return NULL;
    if (root->data == data)
        return root;
    else if (root->data > data)
        BinarySearch(root->left, data);
    else
        BinarySearch(root->right, data);
}

int main()
{
    struct Node *root = createNode(50);
    struct Node *C1 = createNode(40);
    struct Node *C2 = createNode(60);
    struct Node *C3 = createNode(20);
    struct Node *C4 = createNode(45);
    struct Node *C5 = createNode(55);
    struct Node *C6 = createNode(70);

    root->left = C1;
    root->right = C2;
    C1->left = C3;
    C1->right = C4;
    C2->left = C5;
    C2->right = C6;
    
    struct Node * n = BinarySearch(root,70);
    if (n != NULL)
    {
        printf("Found: %d",n->data);
    }
    else
        printf("Element not found");
    return 0;
}