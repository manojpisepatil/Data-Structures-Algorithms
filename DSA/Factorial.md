# Factorial Calculation in Java

This Java program calculates the factorial of a given number using a simple loop. The factorial of a number `n` is the product of all positive integers less than or equal to `n`. For example, the factorial of 5 (denoted as 5!) is `5 * 4 * 3 * 2 * 1 = 120`.

## Code

```java
import java.util.*;

public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // FACTORIAL OF NUMBER
        System.out.print("enter the factorial number :");
        int fact = sc.nextInt();
        int fac = fact;
        for (int i = 1; i < fact; i++) {
            fac = fac * (fact - i);      // 5! = 5*4  20*3  60*2  120*1 ans= 120
        }
        System.out.println(fac);
    }
}
```
## Sample Code
```
enter the factorial number : 5
120
