public class Binary_Search {
    static boolean Search(int[] arr, int s, int e, int key) {
        if (s > e)
            return false;
        int mid = (s + e) / 2;
        if (arr[mid] == key)
            return true;
        else if (arr[mid] > key)
            return Search(arr, s, mid - 1, key);
        else
            return Search(arr, mid + 1, e, key);
    }

    public static void main(String[] a) {
        int[] arr = { 2, 4, 6, 8, 17, 19 };
        int n = arr.length;
        int key = 22;
        System.out.print(Search(arr, 0, n - 1, key));
    }
}