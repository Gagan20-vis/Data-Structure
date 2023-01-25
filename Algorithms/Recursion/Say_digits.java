import java.util.HashMap;

public class Say_digits {
    public static void digits(int n) {
        HashMap<Integer, String> mp = new HashMap<>(10);
        mp.put(0, "Zero");
        mp.put(1, "One");
        mp.put(2, "Two");
        mp.put(3, "Three");
        mp.put(4, "Four");
        mp.put(5, "Five");
        mp.put(6, "Six");
        mp.put(7, "Seven");
        mp.put(8, "eight");
        mp.put(9, "Nine");
        if (n == 0)
            return;
        int mod = n % 10;
        n /= 10;
        digits(n);
        System.out.print(mp.get(mod) + " ");
    }

    public static void main(String[] args) {
        int n = 8;
        digits(n);
    }
}