import java.util.Scanner;
public class HollowRhombus{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      


// Hollow Rhombus Pattern

//         * * * * *
//       *       *
//     *       *
//   *       *
// * * * * *

        int n = 25;
        for (int i = 1; i <= n; i++){
                for (int j = n; j >= i; j--){
                        System.out.print(" ");
                }
                for (int j = 1; j <= n; j++){
                        if(i==1 || j==1 || i==n){ 
                                System.out.print("* ");
                        }
                }
                for (int j = n-1; j > 1; j--){
                        System.out.print("  ");
                }
                if(i==1 || i==n){
                        System.out.print("");
                }
                else{
                        System.out.print("* ");
                }
                System.out.println();
        }
    }
}
