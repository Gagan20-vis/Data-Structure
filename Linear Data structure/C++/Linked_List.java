public class Linked_List {
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // Add first
    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add Last
    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null)
            currNode = currNode.next;
        currNode.next = newNode;
    }

    // Add at Index
    void addAtIndex(int ind, int data) {
        Node newNode = new Node(data);
        Node temp = new Node(data);
        temp = head;
        int i = 0;
        if (head == null) {
            head = newNode;
            return;
        }
        while (i != ind - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ********Deletion************

    // Delete at first
    void DeleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete at last
    void DeleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    static void print() {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(3);
        ll.addLast(77);
        ll.addLast(88);
        ll.addLast(99);
        ll.addAtIndex(2, 105);
        ll.DeleteFirst();
        ll.DeleteLast();
        print();
    }
}