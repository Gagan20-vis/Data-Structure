public class peek_in_arr {
    static int Peek(int[] arr, int s, int e) {
        if (s == e)
            return s;
        if (s < e) {
            int mid = (s + e) / 2;
            if (arr[mid] < arr[mid + 1])
                return Peek(arr, mid + 1, e);
            else
                return Peek(arr, s, mid);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 0 };
        System.out.println("The Peek element is at index :-" + Peek(arr, 0, arr.length - 1));
    }
}