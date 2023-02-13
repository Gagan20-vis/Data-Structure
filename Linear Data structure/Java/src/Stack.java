import java.util.Scanner;
public class Stack {
    int[] arr;
    int top;
    int size;
    Stack(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
    boolean push(int data){
        if(top == size-1){
            return false;
        }
        else{
            arr[++top] = data;
            return true;
        }
    }
    int peek(){return arr[top];}

    boolean pop(){
        if(top == -1){
            return false;
        }
        else{
            top--;
            return true;
        }
    }
    void print(){
        for (int i :arr)
            System.out.print(i+"\t");
        System.out.println();
    }
    public static void main(String[] args) {
        Stack st = new Stack(5);
        Scanner sc = new Scanner(System.in);
        boolean var = true;
        System.out.println("\u001b[H\u001b[2J");

        while (var) {
            System.out.println("\t\t*************Stack operation***************");
            System.out.println("\tSelect one choice");
            System.out.println("1.Push\n2.Pop\n3.Print\n4.Exit\n5.clear screen");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Data :-");
                    int data = sc.nextInt();
                    if (st.push(data)) {
                        System.out.println("Data Inserted");
                    } else {
                        System.out.println("Unable to Insert");
                    }
                }
                case 2 -> {
                    if (st.pop()) {
                        System.out.println(st.peek() + " popped!");
                    } else {
                        System.out.println("unable to pop");
                    }
                }
                case 3 -> st.print();
                case 4 -> {
                    var = false;
                    System.out.println("Exiting....");
                }
                case 5 -> System.out.println("\u0003[H\u001b[2J");
                default -> System.out.println("Please enter a valid choice");
            }
            if (!var) {
                break;
            }
        }
    }
}
