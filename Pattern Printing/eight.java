import java.util.Scanner;
public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row<=n){
            int col = 1;
            int value = row;
            while(col<=row){
                System.out.print(value++ + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
/*
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
 */