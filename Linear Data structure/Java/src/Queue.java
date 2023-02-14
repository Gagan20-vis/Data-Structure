public class Queue {
    int[] arr;
    int size;
    int front;
    int rear;
    Queue(int size)
    {
        this.size = size;
        this.front= this.rear = -1;
        this.arr = new int[size];
    }
    boolean isfull()
    {
        return rear == size - 1;
    }
    boolean isempty()
    {
        return front == rear;
    }
    void EnqueueRear(int data)
    {
        if(isfull())
            System.out.println("Queue is Full!");
        else {
            rear++;
            arr[rear] = data;
        }
    }
//    void EnqueueFront(int data)
//    {
//        if(isfull())
//            System.out.println("Queue is Full!");
//        else{
//
//        }
//    }
    void dequeuefront()
    {
        if(isempty())
            System.out.println("Queue is empty");
        else{
            for(int i = 0;i<rear-1;i++)
                arr[i] = arr[i+1];
            front++;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        System.out.println(q.isempty());
    }
}
