public class InOrder {
    public Node head;
    private static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

    void insert(int data){
        head = insertNode(head,data);
    }
    Node insertNode(Node curr,int data)
    {
        if(curr == null) return new Node(data);
        else if(data<curr.data) curr.left = insertNode(curr.left,data);
        else if(data>curr.data) curr.right = insertNode(curr.right,data);
        return curr;
    }
    public void display()
    {
        Treverse(head);
    }
    private void Treverse(Node head) {
        if (head != null) {
            Treverse(head.left);
            Treverse(head.right);
            System.out.print(head.data + " ");
        }
    }
    public static void main(String[] args) {
        InOrder curr = new InOrder();
        curr.insert(5);
        curr.insert(2);
        curr.insert(7);
        curr.insert(1);
        curr.insert(3);
        curr.display();
    }
}
