#include<stdio.h>
#include<stdlib.h>

struct stack
{
    int top;
    int size;
    int * arr;
};

int isFull(struct stack * ptr)
{
    if (ptr->top == ptr->size-1) 
    {
        return 1;
    }
    else {
        return 0;
    }
}

int isEmpty(struct stack * ptr)
{
    if (ptr->top == -1) 
    {
        return 1;
    }
    else 
    {
        return 0;
    }
}

void push(struct stack * ptr, int data)
{
    if (isFull(ptr)) 
    {
        printf("The Stack is Overflow!!!\n");
    }
    else {
        ptr->top++;
        ptr->arr[ptr->top] = data;
    }
}

int pop(struct stack * ptr)
{
    if (isEmpty(ptr)) 
    {
        printf("The Stack is already empty,can't be POP!!!\n");
    }
    else {
        int data = ptr->arr[ptr->top];
        ptr->top--;
        return data;
    }
}

int peek(struct stack * sp, int i)
{
    if (sp->top-i+1<0) {
        printf("Invalid position\n");
        return -1;
    }
    else {
        return sp->arr[sp->top-i+1];
    }
}

int main()
{
    struct stack * sp = (struct stack *)malloc(sizeof(struct stack));
    sp->size = 10;
    sp->top = -1;
    sp->arr  = (int * )malloc(sp->size * sizeof(int));
    
    printf("Before pushing Full:%d\n", isFull(sp));
    printf("Before pushing empty:%d\n", isEmpty(sp));
    printf("\n");
    
    push(sp,56);
    push(sp,45);
    push(sp,33);
    push(sp,31);
    push(sp,23);
    push(sp,11);
    push(sp,78);
    push(sp,67);
    push(sp,54);
    push(sp,91);
    
    // printf("%d popped from stack\n",pop(sp));
    // printf("%d popped from stack\n",pop(sp));
    // printf("%d popped from stack\n",pop(sp));
    // printf("%d popped from stack\n",pop(sp));
    // printf("%d popped from stack\n",pop(sp));
    // printf("\n");
    // printf("%d popped from stack\n",pop(sp));
    // printf("After poping Full:%d\n", isFull(sp));
    // printf("After poping empty:%d\n", isEmpty(sp));
    
    for (int j = 1; j <= sp->top+1; j++) 
    {
        printf("The value at index %d is %d\n", j ,peek(sp, j));
    }printf("\n");
    
    printf("After pushing Full:%d\n", isFull(sp));
    printf("After pushing empty:%d\n", isEmpty(sp));
    printf("\n");
    return 0;
}