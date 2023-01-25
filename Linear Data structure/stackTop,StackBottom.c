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
    else
    return 0;
}

int isEmpty(struct stack * ptr)
{
    if (ptr->top == -1) 
    {
        return 1;
    }
    else {
    return 0;
    }
}

void push(struct stack * sp, int data)
{
    if (isFull(sp)) 
    {
        printf("Stack Overflow!!!\n Can't be push element\n");
    }
    else {
        sp->top++;
        sp->arr[sp->top] = data;
    }
}

int pop(struct stack * sp)
{
    if (isEmpty(sp)) 
    {
        printf("Stack Underflow!!!\n Can't be pop any element\n");
    }
    else {
        int data = sp->arr[sp->top];
        sp->top--;
        return data;
    }
}

int peek(struct stack * sp,int i)
{
    if (sp->top-i+1<0) 
    {
        printf("Invalid position\n");
    }
    else {
        return sp->arr[sp->top-i+1];
    }
}

int stackTop(struct stack * sp)
{
    return sp->arr[sp->top];
}

int stackBottom(struct stack * sp)
{
    return sp->arr[0];
}
int main()
{
    struct stack * sp = (struct stack *)malloc(sizeof(struct stack));
    sp->size = 10;
    sp->top = -1;
    sp->arr = (int *)malloc(sp->size * sizeof(int));
    
    push(sp, 45);
    push(sp, 55);
    push(sp, 65);
    push(sp, 75);
    push(sp, 85);
    push(sp, 95);
    push(sp, 15);
    push(sp, 25);
    push(sp, 35);
    
    printf("The top most element of the stack is %d\n",stackTop(sp));
    printf("The Bottom most element of the stack is %d\n",stackBottom(sp));
    return 0;
}