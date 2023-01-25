public class First_and_Last_Occur {
    public static int firstOccur(int[] arr, int low, int high, int x, int n) {
        if (high >= low) {
            int mid = (high + low) / 2;
            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                return firstOccur(arr, (mid + 1), high, x, n);
            else
                return firstOccur(arr, low, (mid - 1), x, n);
        }
        return -1;
    }

    public static int LastOccur(int[] arr, int low, int high, int x, int n) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == n - 1 || x < arr[mid + 1])
                    && arr[mid] == x)
                return mid;
            else if (x < arr[mid])
                return LastOccur(arr, low, (mid - 1), x, n);
            else
                return LastOccur(arr, (mid + 1), high, x, n);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 5 };
        int n = arr.length;
        int key = 5;
        System.out.println("The first occurence of " + key + " is :-" +
                firstOccur(arr, 0, n - 1, key, n));
        System.out.println("The Last occurence of " + key + " is :-" +
                LastOccur(arr, 0, n - 1, key, n));
    }
}
