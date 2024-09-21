import java.util.Scanner;
public class loop1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

// HOLLOW RECTANGLE pattern

// * * * * *
// *       *
// *       *
// * * * * *

        int n = 5;
        for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                        if(i == 1 || i == n || j == 1){
                                System.out.print("* ");
                        }
                }
                for(int m = n-1; m > 1; m--){
                        System.out.print("  ");
                }
                System.out.print("* ");
                System.out.println();   
        }      
    }
}
