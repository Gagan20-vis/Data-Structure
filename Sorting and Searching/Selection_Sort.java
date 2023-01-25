public class Selection_Sort {
    public static void printArray(int[] arr, int n) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void Sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 29, 72, 98, 13, 87, 66, 52, 51, 36 };
        int size = arr.length;
        System.out.println("Before Sorting :-");
        printArray(arr, size);
        System.out.println("After Sorting :-");
        Sort(arr, size);
        printArray(arr, size);

    }
}