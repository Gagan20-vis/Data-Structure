import java.util.Scanner;
public class first{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=n)
                System.out.print(j++ + " ");
            System.out.println();
            i++;
        }
    }
}
/*
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 * ................
 */