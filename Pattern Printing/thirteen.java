import java.util.Scanner;
public class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        char start = 'A';
        while(i<=n){
            int j = 1;
            while(j<=i){
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
A 
B C 
C D E 
D E F G 
 */
