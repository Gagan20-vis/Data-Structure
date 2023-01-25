import java.util.Scanner;

public class Stack {
    int[] arr;
    int top, size;

    Stack(int s) {
        size = s;
        arr = new int[size];
        top = -1;
    }

    boolean isempty() {
        return (top < 0);
    }

    boolean push(int data) {
        if (top == size - 1) {
            return false;
        } else {
            arr[++top] = data;
            return true;
        }
    }

    boolean pop() {
        if (top == -1) {
            return false;
        } else {
            top--;
            return true;
        }
    }

    int peek() {
        return arr[top];
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        Scanner sc = new Scanner(System.in);
        boolean temp = true;
        System.out.println("\033[H\033[2J");
        while (temp) {
            System.out.println("\t\t*************Stack operation***************");
            System.out.println("\tSelect one choice");
            System.out.println("1.Push\n2.Pop\n3.Print\n4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Data :-");
                    int data = sc.nextInt();
                    if (st.push(data))
                        System.out.println("Data Inserted");
                    else
                        System.out.println("Unable to Insert");
                    break;
                case 2:
                    if (st.pop())
                        System.out.println(st.peek() + "popped!");
                    else
                        System.out.println("unable to pop");
                    break;
                case 3:
                    st.print();
                    break;
                case 4:
                    temp = false;
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
            if (!temp)
                break;
        }
    }
}