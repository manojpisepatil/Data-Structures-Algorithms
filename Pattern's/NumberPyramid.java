import java.util.Scanner;
public class NumberPyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


// Number Pyramid Pattern

//     1
//    2 2
//   3 3 3
//  4 4 4 4 
// 5 5 5 5 5

        int n = 5;
        for (int i=1; i<=n; i++){
        for (int j=n; j>=i; j--){
                System.out.print(" ");
        }
        for (int j=1; j<=i; j++){
                System.out.print(" "+i);
        }
        System.out.println();
        }
    }
}
