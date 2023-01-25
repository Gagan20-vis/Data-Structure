import java.util.Scanner;

public class L3 {
    // Problem 1
    public static int Sumeshion(int n) {
        // if (n < 1) {
        // System.out.println(sum);
        // return;
        // }
        // sum += n;
        // Sumeshion(n - 1, sum);

        // or
        if (n == 0)
            return 0;
        return n + Sumeshion(n - 1);
    }

    // Problem 2
    public static int Factorial(int n) {
        if (n == 1)
            return 1;
        return n * Factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // System.out.println(Sumeshion(n));
        System.out.println(Factorial(n));
    }
}