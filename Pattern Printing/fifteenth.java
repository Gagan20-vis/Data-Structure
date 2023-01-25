import java.util.Scanner;

public class fifteenth {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int j=1;
        while(i<=n){
            while(j<=n){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
