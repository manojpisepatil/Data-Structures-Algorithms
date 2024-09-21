import java.util.Scanner;
public class loop3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
// 1
// 1 2
// 1 2 3
// 1 2 3 4
        System.out.print("enter the count : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                        System.out.print(" "+j);
                }
                System.out.println();
        }
    }
}
