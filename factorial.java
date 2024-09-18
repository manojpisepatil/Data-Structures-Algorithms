
import java.util.*;

public class factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // FACTORIAL OF NUMBER 
        System.out.print("enter the factorial number :");
        int fact = sc.nextInt();
        int fac=fact;
        for (int i=1; i<fact; i++){
                fac = fac*(fact-i);      // 5! = 5*4  20*3 60*2 120*1 ans= 120
        }
        System.out.println(fac);
    }
}
