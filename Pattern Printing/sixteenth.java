import java.util.Scanner;
public class sixteenth {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
            char ch = (char) ('A'+n-i);
            while(j<=i){
                System.out.print(ch+" ");
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
/*
D 
C D
B C D
A B C D
 */
