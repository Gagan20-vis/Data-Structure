public class Square_root {
    static int Square(int n, int s, int e) {
        int mid = (s + e) / 2;
        long sqr = mid * mid;
        if (sqr <= n && ((mid + 1) * (mid + 1)) > n)
            return mid;
        if (sqr > n)
            return Square(n, s, mid - 1);
        else
            return Square(n, mid + 1, e);
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(Square(n, 0, n));
    }
}
