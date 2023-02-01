#include <stdio.h>
#include <stdlib.h>

struct queue
{
    int size;
    int f;
    int r;
    int *arr;
};

int isFull(struct queue *ptr)
{
    if (ptr->r == ptr->size - 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int isEmpty(struct queue *ptr)
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

void enqueue(struct queue *q, int val)
{
    if (isFull(q))
    {
        printf(" Queue Overflow!!!\n");
    }
    else
    {
        q->r++;
        q->arr[q->r] = val;
    }
    // printf("Element = %d\n", val);
}

int dequeue(struct queue *q)
{
    int a = -1;
    if (isEmpty(q))
    {
        printf(" Queue Underflow!!!\n");
    }
    else
    {
        q->f++;
        a = q->arr[q->f];
    }
    return a;
}

void main()
{
    struct queue q;
    q.size = 4;
    q.f = q.r = -1;
    q.arr = (int *)malloc(q.size * sizeof(int));

    enqueue(&q, 12);
    enqueue(&q, 22);
    enqueue(&q, 32);
    enqueue(&q, 42);
    printf("Dequeuing element %d\n",dequeue(&q));
    printf("Dequeuing element %d\n",dequeue(&q));
    printf("Dequeuing element %d\n",dequeue(&q));
    printf("Dequeuing element %d\n",dequeue(&q));
    enqueue(&q, 49);
    printf("Dequeuing element %d\n",dequeue(&q));

    if (isEmpty(&q))
    {
        printf("Queue is empty\n");
    }
    if (isFull(&q))
    {
        printf("Queue is full\n");
    }
}