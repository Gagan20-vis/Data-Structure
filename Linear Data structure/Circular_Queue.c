#include <stdio.h>
#include <stdlib.h>

struct Circular_Queue
{
    int size;
    int f;
    int r;
    int *arr;
};

int isFull(struct Circular_Queue *ptr)
{
    if ((ptr->r + 1) % ptr->size == ptr->f)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int isEmpty(struct Circular_Queue *ptr)
{
    if (ptr->r == ptr->f)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void enqueue(struct Circular_Queue *q, int val)
{
    if (isFull(q))
    {
        printf(" Circular_Queue Overflow!!!\n");
    }
    else
    {
        printf("Enqued element %d\n", val);
        q->r = (q->r + 1) % q->size;
        q->arr[q->r] = val;
    }
}

int dequeue(struct Circular_Queue *q)
{
    int a = -1;
    if (isEmpty(q))
    {
        printf(" Circular_Queue Underflow!!!\n");
    }
    else
    {
        q->f = (q->f + 1) % q->size;
        a = q->arr[q->f];
    }
    return a;
}

void main()
{
    struct Circular_Queue q;
    q.size = 4;
    q.f = q.r = 0;
    q.arr = (int *)malloc(q.size * sizeof(int));

    enqueue(&q, 12);
    enqueue(&q, 22);
    enqueue(&q, 32);
    printf("Dequeuing element %d\n", dequeue(&q));
    printf("Dequeuing element %d\n", dequeue(&q));
    printf("Dequeuing element %d\n", dequeue(&q));
    enqueue(&q, 22);
    enqueue(&q, 32);
    enqueue(&q, 1);
    printf("Dequeuing element %d\n", dequeue(&q));
    printf("Dequeuing element %d\n", dequeue(&q));
    printf("Dequeuing element %d\n", dequeue(&q));

    if (isEmpty(&q))
    {
        printf("Circular_Queue is empty");
    }
    if (isFull(&q))
    {
        printf("Circular_Queue is full");
    }
}