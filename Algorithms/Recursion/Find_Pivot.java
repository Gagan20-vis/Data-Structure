public class Find_Pivot {
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

    public static void main(String[] args) {
        int[] arr = { 8, 10, 17, 1, 5 };
        int n = arr.length;
        System.out.println(
                "Pivot element " + arr[Pivot(arr, 0, n - 1)] + " is present at index :-" + Pivot(arr, 0, n - 1));
    }
}