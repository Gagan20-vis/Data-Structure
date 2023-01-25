import java.util.ArrayList;

public class L6 {
    public static void printF(int ind, int[] arr, ArrayList<Integer> ds, int n) {
        if (ind == n) {
            for (int i : ds)
                System.out.print(i + " ");
            if (ds.size() == 0)
                System.out.print("{}");
            System.out.println();
            return;
        }
        // Take the particular index into the subsequence
        ds.add(arr[ind]);
        printF(ind + 1, arr, ds, n);

        ds.remove(ds.size() - 1);

        // not pick or not take condition, this element is not added to your subsequence
        printF(ind + 1, arr, ds, n);
    }

    public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<>();
        int[] arr = { 3, 1, 2 };
        int n = arr.length;
        printF(0, arr, ds, n);
    }
}