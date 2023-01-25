// package Algorithms.Recursion;
public class book_allocation {
    static boolean isPossible(int[] arr, int n, int m, int mid) {
        int Student = 1;
        int PageSum = 0;
        int itr = 0;
        for (int i = 0; i < n; i++) {
            if (PageSum + arr[i] <= mid)
                PageSum += arr[i];
            else {
                Student++;
                if (Student > m || arr[i] > mid)
                    return false;
                PageSum = arr[i];
            }
        }
        return true;
    }

    static int findPages(int[] arr, int n, int m, int s, int e, int ans) {
        if (s > e)
            return ans;
        if (s < e) {
            int mid = (s + e) / 2;
            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                return findPages(arr, n, m, s, mid - 1, ans);
            } else
                return findPages(arr, n, m, mid + 1, e, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 34, 67, 90 };
        int n = arr.length;
        int m = 2;
        int sum = 0;

        for (int i : arr)
            sum += i;
        System.out.println(findPages(arr, n, m, 0, sum, -1));
    }
}
