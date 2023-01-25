import java.util.ArrayList;

public class L7 {
    // print subsequences which have sum equal to k
    public static void printksum(int ind, ArrayList<Integer> ds, int s, int[] arr, int n, int k) {
        if (ind == n) {
            if (s == k)
                System.out.println(ds);
            return;
        }
        s += arr[ind];
        ds.add((arr[ind]));
        printksum(ind + 1, ds, s, arr, n, k);
        s -= arr[ind];
        ds.remove(ds.size() - 1);
        printksum(ind + 1, ds, s, arr, n, k);
    }

    // print only one subsequence which have sum equal to k
    public static boolean printsum(int ind, ArrayList<Integer> ds, int s, int[] arr, int n, int k) {
        if (ind == n) {
            if (s == k)
                return true;
            else
                return false;
        }
        ds.add(arr[ind]);
        s += arr[ind];
        if (printsum(ind + 1, ds, s, arr, n, k) == true)
            return true;

        s -= arr[ind];
        ds.remove(ds.size() - 1);
        if (printsum(ind + 1, ds, s, arr, n, k) == true)
            return true;
        return false;
    }

    // print count of sum of subsequences
    public static int printcount(int ind, ArrayList<Integer> ds, int s, int[] arr, int n, int k) {
        if (ind == n) {
            if (s == k)
                return 1;
            else
                return 0;
        }
        ds.add(arr[ind]);
        s += arr[ind];

        int left = printcount(ind + 1, ds, s, arr, n, k);

        s -= arr[ind];
        ds.remove(ds.size() - 1);

        int right = printcount(ind + 1, ds, s, arr, n, k);
        return left + right;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<>();
        int[] arr = { 1, 2, 1 };
        int n = 3;
        int k = 2;
        printksum(0, ds, 0, arr, n, k);
        // System.out.println(printsum(0, ds, 0, arr, n, k));
        // System.out.println(printcount(0, ds, 0, arr, n, k));
    }
}