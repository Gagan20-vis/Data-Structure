public class Linear {
    public static boolean Search(int[] arr, int n, int key) {
        if (n == 0)
            return false;
        if (key == arr[n - 1])
            return true;
        return Search(arr, n - 1, key);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7, 1, 9 };
        int n = arr.length;
        int key = 6;
        if (Search(arr, n, key))
            System.out.println("Elelment is present.");
        else
            System.out.println("Elelment is not  present.");
    }
}
