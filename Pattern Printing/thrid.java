import java.util.Scanner;;
public class thrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(n-j+1+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
/*
    6 5 4 3 2 1
    6 5 4 3 2 1
    6 5 4 3 2 1
    6 5 4 3 2 1
    6 5 4 3 2 1
 */
