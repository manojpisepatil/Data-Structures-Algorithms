import java.util.Scanner;
public class SolidRhombus{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

// Solid Rhombus Pattern

//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *


        int n = 5;
        int star = n;
        for (int i = 0; i < n; i++){
        for (int j = star; j > i; j--){
                System.out.print(" ");
        }
        for (int j = 0; j < star; j++){
                System.out.print("* ");
        }
        System.out.println();
        }
    }
}
