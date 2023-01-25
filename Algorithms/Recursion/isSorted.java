public class isSorted {
    public static boolean Check(int[] arr, int n) {
        if (n == 0 || n == 1)
            return true;
        if (arr[n - 2] > arr[n - 1])
            return false;
        else {
            boolean remain = Check(arr, n - 1);
            return remain;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 1, 2, 3 };
        int n = arr.length;
        if (Check(arr, n))
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is not Sorted");
    }
}