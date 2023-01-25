public class getSum {
    public static int Sum(int[] arr, int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return arr[0];
        int ans = arr[n - 1] + Sum(arr, n - 1);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2, 6, 7 };
        int n = arr.length;
        System.out.println(Sum(arr, n));
    }
}
