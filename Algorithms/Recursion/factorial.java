public class factorial {
    public static double fact(double n) {
        if (n == 1)
            return n;
        double ans = n * fact(n - 1);
        return ans;
    }

    public static void main(String[] args) {
        double n = 10;
        System.out.println(fact(n));
    }
}