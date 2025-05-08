# Reverse Number Program in Java

This Java program takes an integer input from the user and reverses the digits of the number using a `while` loop.

## Code

```java
import java.util.*;
public class ReverseNum {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the numbers to reverse: ");   // Enter number by user
    int num = sc.nextInt();
    int rem = 0;
    int n = 0;
    while (num > 0) {
      rem = num % 10;        // Get the last digit of the number
      num = num / 10;        // Remove the last digit from the number
      n = n * 10 + rem;      // Add the digit to the reversed number
    }
    System.out.println("Reverse number is: " + n);
  }
}
```
## Sample Output
```
Enter the numbers to reverse: 12345
Reverse number is: 54321
