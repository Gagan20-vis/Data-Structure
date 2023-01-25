import java.util.Scanner;

public class eighteenth {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row<=n){
            int col = 1;
            while(col<=n-row+1){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
/*
* * * * 
* * *
* *
*
 */
