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
    return root;
}

void insert(struct Node *root, int key)
{
    struct Node *prev = NULL;
    while (root != NULL)
    {
        prev = root;
        if (key == root->data)
        {
            printf("Cannot insert %d, already in BST", key);
            return;
        }
        else if (key < root->data)
            root = root->left;
        else
            root = root->right;
    }
    struct Node *new = createNode(key);
    if (key < prev->data)
        prev->left = new;
    else
        prev->right = new;
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

    insert(root, 10);
    printf("%d", root->right->right->data);
    return 0;
}
