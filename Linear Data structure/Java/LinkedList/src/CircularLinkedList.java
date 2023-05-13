public class CircularLinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void addHead(int data) {
        Node curr = new Node(data);
        if (head == null) {
            head = curr;
            head.next = head;
        } else {
            Node fake = head;
            while (fake.next != null) fake = fake.next;
            fake.next = curr;
            curr.next = head;
            head = curr;
        }
    }

    public void addTail(int data) {
        Node curr = new Node(data);
        if (head == null) {
            head = curr;
            head.next = head;
        } else {
            Node fake = head;
            while (fake.next != null) fake = fake.next;
            fake.next = curr;
            curr.next = head;
        }
    }

    public void remove(int index) {
        int count = 0;
        Node curr = head;
        while(count<index){
            curr = curr.next;
            count++;
        }
        curr.data = curr.next.data;
        curr.next = curr.next.next;
    }

    public void removeHead() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
            return;
        }
        Node curr = head;
        while(curr.next!=head) curr = curr.next;
        curr.next = head.next;
        head = head.next;

    }

    public void removeTail() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
            return;
        }
        Node curr = head;
        while(curr.next.next !=head) curr = curr.next;
        curr.next = head;
    }

    public void print(){
        Node curr = head;
        while(curr.next !=head){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        CircularLinkedList ll = new CircularLinkedList();
        ll.addHead(56);
        ll.addHead(57);
        ll.addHead(58);
//        ll.addTail(45);
//        ll.addTail(46);
//        ll.addTail(47);
//        ll.print();
//        ll.removeHead();
//        ll.removeTail();
//        ll.remove(2);
//        System.out.println();
//        ll.print();
    }
}
