public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    Node head;
    public void addHead(int data){
        Node curr = new Node(data);
        if(head!=null){
            curr.next = head;
            head.prev = curr;
        }
        head = curr;
    }
    public void addTail(int data){
        Node curr = new Node(data);
        if(head==null) head = curr;
        else{
            Node fake = head;
            while(fake.next !=null) fake = fake.next;
            fake.next = curr;
            curr.prev =fake;
        }
    }
    public void removeHead(){
        if(head!=null){
            head = head.next;
            head.prev = null;
        }
    }
    public void removeTail(){
        if(head.next == null)  head = null;
        if(head!=null){
            Node curr = head;
            while(curr.next!=null) curr = curr.next;
            curr.prev.next = null;
        }
    }
    public void remove(int index){
        int count = 0;
        Node curr = head;
        while(count<index&&curr!=null){
            curr = curr.next;
            count++;
        }
        assert curr != null;
        curr.prev.next = curr.next;
    }
    public void print(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();
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
