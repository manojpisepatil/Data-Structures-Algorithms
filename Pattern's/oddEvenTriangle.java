import java.util.Scanner;
public class oddEvenTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      

//  ODD-EVEN ( 0-1 ) triangle pattern

// 1
// 0 1
// 0 1 0
// 1 0 1 0
// 1 0 1 0 1

        int n = 5;
        int k = 0;
        for(int i=1; i<=n; i++){
        // k = (k == 0)?1:0;
        for(int j=1; j<=i; j++){
                k = (k == 0)?1:0;
                System.out.print(" "+k);
        }
        System.out.println();
        }
    }
}
