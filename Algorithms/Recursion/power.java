import java.util.Scanner;

public class power {
    public static int pow(int n, int p, int cnt, int res) {
        if (cnt == p)
            return res;
        res *= n;
        return pow(n, p, cnt + 1, res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n = sc.nextInt();
        System.out.print("Enter power :-");
        int p = sc.nextInt();
        int res = n;
        System.out.println(pow(n, p, 1, res));
    }
}