import java.util.Scanner;
public class loop4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      
// A
// BC
// DEF 
// GHIJ

        System.out.print("enter the count  (e.g 4) : ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                        System.out.print(ch);
                        ch++;
                }
        
                System.out.println();
        }
    }
}
