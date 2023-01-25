import java.util.*;

//Problem 1
public class L2 {
    public static void Print(String name, int count) {
        if (count >= 5)
            return;
        System.out.println(name);
        count++;
        Print(name, count);
    }

    // Problem 2
    public static void LinearPrint(int n, int i) {
        if (i > n)
            return;
        System.out.print(i++ + " ");
        LinearPrint(n, i);
    }

    // Problem 3
    public static void ReversePrint(int n) {
        if (n < 1)
            return;
        System.out.print(n-- + " ");
        ReversePrint(n);
    }

    // Problem 4
    public static void LinearPrintBacktrack(int i, int n) {
        if (i < 1)
            return;
        LinearPrintBacktrack(i - 1, n);
        System.out.print(i + " ");
    }

    // Problem 5
    public static void ReversePrintBackTrack(int i, int n) {
        if (i > n)
            return;
        ReversePrintBackTrack(i + 1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Name :- ");
        // String name = sc.nextLine();
        int count = 0;
        // Print(name, count);
        // LinearPrint(10, 1);
        // ReversePrint(10);
        // LinearPrintBacktrack(3, 3);
        ReversePrintBackTrack(1, 5);
    }
}