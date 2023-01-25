public class Search_in_rotated {

    public static int Pivot(int[] arr, int s, int e) {
        int mid = (s + e) / 2;
        if (s == e)
            return s;
        if (arr[mid] >= arr[0])
            return Pivot(arr, mid + 1, e);
        if (arr[mid] <= arr[0])
            return Pivot(arr, s, mid);
        return s;
    }

    public static int Binary_Search(int[] arr, int s, int e, int key) {
        if (s > e)
            return -1;
        int mid = (s + e) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            return Search(arr, s, mid - 1, key);
        else
            return Search(arr, mid + 1, e, key);
    }

    public static int Search(int[] arr, int s, int e, int key) {
        int pivot = Pivot(arr, s, e);
        if (arr[pivot] <= key && key <= arr[e])
            return Binary_Search(arr, pivot, e, key);
        else
            return Binary_Search(arr, s, pivot - 1, key);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr.length;
        int key = 20;
        System.out.println(Search(arr, 0, n - 1, key));
    }
}
