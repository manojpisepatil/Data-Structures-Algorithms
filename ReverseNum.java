import java.util.*;

public class ReverseNum{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the numbers to reverse : ");   // Enter number by user
    int num = sc.nextInt();

    int rem = 0;
    int n = 0;
    while(num>0){
      rem = num % 10;
      num = num/10 ;
      n = n*10 +rem;
    }
    System.out.println("Reverse number is : "+n);
  }
}
