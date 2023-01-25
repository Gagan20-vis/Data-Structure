#include<stdio.h>
#include<stdlib.h>

struct Node 
{
    int data;
    struct Node * next;
};

struct Node * top = NULL;

void traversal(struct Node * ptr)
{
    while (ptr != NULL) 
    {
        printf("Element :- %d\n",ptr->data);
        ptr = ptr->next;
    }
}

int isFull(struct Node * top)
{
    struct Node * p = (struct Node * )malloc(sizeof(struct Node));
    if (p == NULL) 
        return 1;
    return 0;
}

int isEmpty(struct Node * top)
{
    if (top == NULL) 
        return 1;
    return 0;
}

struct Node * push(struct Node * top, int data)
{
    if (isFull(top)) 
        printf("Stack Overflow!!!\n");
    else 
    {
        struct Node * n = (struct Node * )malloc(sizeof(struct Node));
        n->data = data;
        n->next = top;
        top = n;
        return top;
    }
}

int pop(struct Node * tp)
{
    if (isEmpty(tp)) 
    {
        printf("Stack Underflow!!!\n");
    }
    else 
    {
        struct Node * n = tp;
        top = tp->next;
        int x = n->data;
        free(n);
        return x;
    }
}

int peek(int pos)
{
    struct Node * ptr = top;
    for (int i = 0; i<pos -1 && (ptr != NULL); i++) 
    {
        ptr = ptr->next;
    }
    if (ptr!=NULL) 
    {
        return ptr->data;
    }
    else 
    {
        return -1;
    }
}

int stackTop(struct Node * top)
{
    return top->data;
}

// int stackBottom(struct Node * top)
// {
//     return expression;
// }

int main()
{
    top = push(top, 56);
    top = push(top, 45);
    top = push(top, 33);
    top = push(top, 24);
    traversal(top);
    // printf("Popped element :- %d\n",pop(top));
    // traversal(top);
    printf("The top most element of the stack is :- %d\n",stackTop(top));
    for (int j = 0; j < 4; j++) 
    {
    printf("The value at index %d is %d\n",j,peek(j));
    }
    return 0;
}