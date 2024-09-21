import java.util.Scanner;
public class loop1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

// Nested Loops 

// *
// * * 
// * * *
// * * * *
        System.out.print("enter the n : ");
        int n = sc.nextInt();
        // String ch = "*";
        for(int i=1; i<=n; i++){
                for(int j = 0; j<i; j++){
                        System.out.print(" *");
                }
                System.out.println();
        }


    }
}
