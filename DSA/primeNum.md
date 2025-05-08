# Prime Number Checker in Java

This Java program checks whether a given number is a **prime number** or not. A prime number is a number greater than 1 that has no divisors other than 1 and itself.

## Code

```java
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
```
## Sample Output
```
Enter the number : 7
Prime number
