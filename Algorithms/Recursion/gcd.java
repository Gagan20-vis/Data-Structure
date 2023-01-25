public class gcd {
    public static int GCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        if (a > b)
            return GCD(a, a - b);
        else
            return GCD(b - a, b);
    }

    public static void main(String[] args) {
        System.out.println(GCD(24, 72));
    }
}