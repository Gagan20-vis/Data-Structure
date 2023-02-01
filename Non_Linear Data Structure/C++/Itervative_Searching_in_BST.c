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
    root->left = NULL;
    root->right = NULL;
    root->data = data;
}

struct Node *BinarySearch(struct Node *root, int data)
{
    while (root != NULL)
    {
        if (data == root->data)
            return root;
        else if (data <= root->data)
            root = root->left;
        else
            root = root->right;
    }
    return NULL;
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

    struct Node *n = BinarySearch(root, 45);
    if (n != NULL)
    {
        printf("Found: %d", n->data);
    }
    else
        printf("Element not found");
    return 0;
}