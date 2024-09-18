import java.util.*;

public class primeNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean primenum = true;        
        System.out.print("Enter the number : ");
        int n =  sc.nextInt();

        for (int i = 2; i < (n-1); i++){
                if(n%i==0){
                        primenum = false;
                        break;
                }
                if(n = 2){
                        primenum = true;
                        break;
                }
        }
        if (primenum == true){
                System.out.println("Prime number ");
        } else{
                System.out.println("Consonant Number");
        }
    }
}
