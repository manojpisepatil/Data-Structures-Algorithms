import java.util.Scanner;
public class loop5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      
// INVERTED & ROTATED HALF-PYRAMID pattern

// ****
// ***
// **
// *
        int k = 4;
        for (int i=1; i<=k; i++){
                for(int j=k; j>=i; j--){
                        System.out.print(" *");
                }
                System.out.println();
        }

// INVERTED HALF-PYRAMID with Numbers pattern

// 12345
// 1234
// 123
// 12
// 1 
        int n = 5;
        for(int i=1; i<=n; i++){
                for(int j=n; j>=i; j--){
                        System.out.print(n-j+1);
                }
                System.out.println();
        }
    }
}
