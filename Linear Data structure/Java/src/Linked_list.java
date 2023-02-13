import  java.util.Scanner;
public class Linked_list
{
    static Node head;
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    boolean insertFirst(int data)
    {
        Node q = new Node(data);
        q.next = head;
        head = q;
        return true;
    }
    boolean insertLast(int data){
        Node newNode = new Node(data);
        Node currNode = head;
        while(currNode.next != null)
            currNode = currNode.next;
        currNode.next = newNode;
        return true;
    }
    boolean deleteFirst(){
        if(head == null)
            return false;
        Node n = head;
        n = n.next;
        head = n;
        return true;
    }boolean deleteLast(){
    if(head == null)
        return false;
        Node curr = head;
        while(curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return true;
    }
    void print()
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+"\t");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linked_list ll = new Linked_list();
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001b[H\u001b[2J");
        while(true)
        {
            System.out.println("\t\t*************Linked List operation***************");
            System.out.println("\tSelect one choice");
            System.out.println("1.InsertFirst\n2.InsertLast\n3.DeleteFirst\n4.DeleteLast\n5.Print\n6.Exit\n7.clear screen");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1 -> {
                    System.out.print("Enter Data :-");
                    int data = sc.nextInt();
                    if (ll.insertFirst(data)) {
                        System.out.println("Data Inserted");
                    } else {
                        System.out.println("Unable to Insert");
                    }
                }case 2 -> {
                    System.out.print("Enter Data :-");
                    int data = sc.nextInt();
                    System.out.println("Data Inserted");
                }case 3 -> {
                    if (ll.deleteFirst()) {
                        System.out.println("Deleted!");
                    } else {
                        System.out.println("Already Empty");
                    }
                }case 4 -> {
                    if (ll.deleteLast()) {
                        System.out.println("Deleted!");
                    } else {
                        System.out.println("Already Empty");
                    }
                }case 5 -> {
                    ll.print();
                }case 6 -> {
                    System.out.println("Exiting....");
                    break;
                }
                case 7 -> {
                    System.out.println("\u001b[H\u001b[2J");
                }
                default -> {
                    System.out.println("Please Enter a valid choice");
                }
            }
        }
    }
}
