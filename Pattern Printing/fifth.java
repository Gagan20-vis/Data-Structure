import java.util.Scanner;
public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        // for (int i = 1; i <= n; i++) {
        //     int j=1;
        //     for (j =1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}
/*
* 
* *
* * *
* * * *
 */
