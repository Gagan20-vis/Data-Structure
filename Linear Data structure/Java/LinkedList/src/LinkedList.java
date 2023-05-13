public class LinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head;

    public void addHead(int data){
        Node curr = new Node(data);
        if(head!=null) curr.next = head;
        head = curr;
    }
    public void addTail(int data){
        Node curr = new Node(data);
        if(head == null) head = curr;
        else{
            Node fake = head;
            while(fake.next != null) fake = fake.next;
            fake.next = curr;
        }
    }
    public void removeTail(){
        if(head.next==null) head = null;
        if(head!=null){
            Node curr = head;
            while(curr.next.next != null){
                curr = curr.next;
            }
            curr.next = null;
        }
    }
    public void removeHead(){
        if(head!=null)
            head = head.next;
    }

    public void remove(int index){
        int count = 0;
        Node curr = head;
        while(count<index&&curr!=null){
            curr = curr.next;
            count++;
        }
        curr.data = curr.next.data;
        curr.next = curr.next.next;
    }

    public void print(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addHead(56);
        ll.addHead(57);
        ll.addHead(58);
        ll.addTail(45);
        ll.addTail(46);
        ll.addTail(47);
        ll.print();
        ll.removeHead();
        ll.removeTail();
        ll.remove(2);
        System.out.println();
        ll.print();

    }
}
