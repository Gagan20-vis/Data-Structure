#include<stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node * next;
};

//Traversal
void linkedlistTraversal(struct Node * ptr)
{
    while (ptr != NULL) 
    {
        printf("Element %d\n",ptr->data);
        ptr = ptr->next;
    }
}

//Deletion at first
struct Node * DeleteFirst(struct Node * head)
{
    struct Node * ptr = head;
    head = head->next;
    free(ptr);
    return head;
}

//Deletion at any index
struct Node * DeleteAtIndex(struct Node * head,int index)
{
    struct Node * p = head;
    struct Node * q = head->next;

    for (int i = 0; i < index-1; i++) 
    {
        p = p->next;
        q = q->next;
        p->next = q->next;
        free(q);
    }
    return head;
}

//Deletion at last
struct Node * Deletelast(struct Node * head)
{
    struct Node * p = head;
    struct Node * q = head->next;
    while (q->next != NULL) 
    {
        p = p->next;
        q = q->next;
    }
    p->next = NULL;
    free(q);
    return head;
}

//Deleting the element with a given value
struct Node * deleteAtValue(struct Node * head, int value)
{
    struct Node * p = head;
    struct Node * q = head->next;
    while (q->data != value && q->next != NULL) 
    {
        p = p->next;
        q = q->next;
    }
    if (q->data == value) 
    {
        p->next = q->next;
        free(q);
    }
    return head;
}
int main()
{
    struct Node * head;
    struct Node * second;
    struct Node * third;
    struct Node * fourth;

    //Allocate memory for nodes in the linked list in Heap
    head = (struct Node * )malloc(sizeof(struct Node));
    second = (struct Node * )malloc(sizeof(struct Node));
    third = (struct Node * )malloc(sizeof(struct Node));
    fourth = (struct Node * )malloc(sizeof(struct Node));

    //Link first and second nodes
    head->data = 7;
    head->next = second;

    //Link second and third nodes
    second->data = 11;
    second->next = third;

    //Terminate the list at the third node
    third->data = 66;
    third->next = fourth;

    fourth->data = 88;
    fourth->next = NULL;

    printf("\n");
    printf("Before Deletion\n");
    linkedlistTraversal(head);
    printf("\n");
    printf("After Deletion\n");
    // head = DeleteFirst(head);
    // head = DeleteAtIndex(head, 2);
    // head = Deletelast(head);
    head = deleteAtValue(head, 13);
    linkedlistTraversal(head);
    return 0;
}