# Maximum Sum Subarray in Java (Traditional Method)

This Java program calculates the maximum sum of a subarray from a given array using a brute-force approach. It uses three nested loops to find all possible subarrays, computes their sums, and identifies the one with the maximum sum.

## Code

```java
public class maxsumSubArray {
    public static void main(String args[]){
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        traditionalMethod(arr);
    }

    public static void traditionalMethod(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(" "+arr[k]);
                    sum = sum +arr[k];
                }
                max = Math.max(sum , max);
                System.out.print(" sum : "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("--------------> max is : "+max);
    }
}
```
## Sample Output
```
1 sum : 1

1 2 sum : 3

1 2 3 sum : 6

1 2 3 4 sum : 10

1 2 3 4 5 sum : 15

1 2 3 4 5 6 sum : 21

1 2 3 4 5 6 7 sum : 28

1 2 3 4 5 6 7 8 sum : 36

1 2 3 4 5 6 7 8 9 sum : 45

1 2 3 4 5 6 7 8 9 10 sum : 55

...

--------------> max is : 55

