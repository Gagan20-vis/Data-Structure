import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class Tree {
    static Scanner sc = new Scanner(System.in);
    static Node insert(){
        Node root;
        System.out.print("Enter data:- ");
        int data = sc.nextInt();
        if(data == -1) return null;
        root = new Node(data);
        System.out.print("Enter left for "+data +" ");
        root.left = insert();
        System.out.print("Enter right for "+data +" ");
        root.right = insert();
        return root;
    }
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = insert();
        inorder(root);
    }
}
