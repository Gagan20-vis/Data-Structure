#include<stdio.h>
#include<stdlib.h>

struct stack
{
    int size;
    int top;
    int * arr;
};

int isFull(struct stack * ptr)
{
    if (ptr->top == ptr->size-1 ) 
    {
        return 1;
    }
    else 
    {
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
        printf("Stack overflow! Cannot push %d to the stack\n",data);
    }
    else 
    {
        ptr->top++;
        ptr->arr[ptr->top] = data;
    }
}

int  pop(struct stack * ptr)
{
    if (isEmpty(ptr)) 
    {
        printf("Stack Underflow! Cannot push to the stack\n");
        return -1;
    }
    else 
    {
        int data = ptr->arr[ptr->top];
        ptr->top--;
        return data;
    }
}

int main()
{
    struct stack * sp = (struct stack *)malloc(sizeof(struct stack));
    sp->size = 10;
    sp->top = -1;
    sp->arr = (int * )malloc(sp->size * sizeof(int));
    
    printf("Before pushing Full:%d\n", isFull(sp));
    printf("Before pushing Empty :%d\n",isEmpty(sp));
    printf("\n");
    
    push(sp, 6);
    push(sp, 16);
    push(sp, 26);
    push(sp, 36);
    push(sp, 46);
    push(sp, 56);
    push(sp, 66);
    push(sp, 76);
    push(sp, 86);
    push(sp, 96);   // ----> Pushed 10 values
    // push(sp, 106);    // Stack Overflow since the size of the stack is 10
    
    printf("After pushing Full: %d\n", isFull(sp));
    printf("After pushing Empty:%d\n",isEmpty(sp));
    printf("\n");
    
    printf("Popped %d from the stack\n", pop(sp));    //Last in First out
    printf("Popped %d from the stack\n", pop(sp));    //Last in First out
    printf("Popped %d from the stack\n", pop(sp));    //Last in First out
    printf("Popped %d from the stack\n", pop(sp));    //Last in First out
    printf("Popped %d from the stack\n", pop(sp));    //Last in First out
    printf("Popped %d from the stack\n", pop(sp));    //Last in First out
    printf("Popped %d from the stack\n", pop(sp));    //Last in First out
    printf("Popped %d from the stack\n", pop(sp));    //Last in First out
    printf("Popped %d from the stack\n", pop(sp));    //Last in First out
    printf("Popped %d from the stack\n", pop(sp));    //Last in First out
    
    printf("\n");
    
    printf("After poping Full: %d\n", isFull(sp));
    printf("After poping Empty:%d\n",isEmpty(sp));
    return 0;
}