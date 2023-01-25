public class Doubly_LL {
    static Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            this.data = d;
            this.next = null;
            this.prev = null;
        }
    }

    void Insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null)
            currNode = currNode.next;
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    static void print() {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Doubly_LL ll = new Doubly_LL();
        ll.Insert(45);
        ll.Insert(34);
        ll.Insert(23);
        print();
    }
}
