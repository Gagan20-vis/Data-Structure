#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node * next;
};

void Traversal(struct Node * head)
{
    struct Node * ptr = head;
    do 
    {
        printf("Element :- %d\n",ptr->data);
        ptr = ptr->next;
    }
    while (ptr != head);
}

struct Node * InsertAtFirst(struct Node * head, int data)
{
    struct Node * ptr = (struct Node *)malloc(sizeof(struct Node));
    ptr->data = data;
    struct Node * p = head->next;
    do 
    {
        p = p->next;
    }
    while (p->next != head); 
    //At this point p pointing the last node of this circular linked list

    p->next = ptr;
    ptr->next = head;
    head = ptr;
    return head;
}

struct Node * InsertAtLast(struct Node * head, int data)
{
    struct Node * ptr = (struct Node *)malloc(sizeof(struct Node));
    struct Node * p = head;
    struct Node * q = p->next;
    ptr->data = data;

    while (q->next != head) 
    {
        p = p->next;
        q = q->next;
    }
    q->next = ptr;
    ptr->next = head;
    return head;
}

struct Node * InsertAtIndex(struct Node * head, int data, int index)
{
    struct Node * ptr = (struct Node *)malloc(sizeof(struct Node));
    struct Node * p = head;
    int i = 0;

    while (i != index-1) 
    {
        p = p->next;
        i++;
    }
    ptr->data = data;
    ptr->next = p->next;
    p->next = ptr;
    return head;
}

int main()
{
    struct Node * head;
    struct Node * second;
    struct Node * third;
    struct Node * fourth;
    struct Node * five;
    struct Node * six;

    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    fourth = (struct Node *)malloc(sizeof(struct Node));
    five = (struct Node *)malloc(sizeof(struct Node));
    six = (struct Node *)malloc(sizeof(struct Node));

    head->data = 5;
    head->next = second;

    second->data = 7;
    second->next = third;

    third->data = 11;
    third->next = fourth;

    fourth->data = 14;
    fourth->next = five;

    five->data = 17;
    five->next = six;

    six->data = 21;
    six->next = head;

    printf("\n");
    printf("Circular Linked List before Insertion\n");
    Traversal(head);
    printf("\n");
    printf("Circular Linked List After Insertion\n");
    // head = InsertAtFirst(head, 54);
    // head = InsertAtLast(head, 88);
    head = InsertAtIndex(head, 54, 6);
    Traversal(head);
    return 0;
} 