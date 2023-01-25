import java.util.Scanner;
public class twelth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        char start = 'A';
        while(i<=n){
            int j = 1;
            while(j<=n){
                System.out.print(start+" ");
                j++;
                start++;
            }
            System.out.println();
            i++;
        }
    }
}
/*
A B C 
B C D
C D E
 */
