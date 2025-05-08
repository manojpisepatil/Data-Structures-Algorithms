# Prefix Array in Java

This program demonstrates how to find the maximum sum of any subarray in a given array using the prefix sum approach.

## Code

```java
public class PrefixArray {
    public static void main(String args[]){
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("maxsum is : "+prefics(arr));
    }

    public static int prefics(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                sum = i==0? prefix[j] : prefix[j] - prefix[i-1];   // formula for max prefix subarray  sum
                System.out.println("SUM : "+sum);
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;
    }   
}
```
## Sample Output
```
SUM : 1
SUM : 3
SUM : 6
SUM : 10
SUM : 15
SUM : 21
SUM : 28
SUM : 36
SUM : 45
SUM : 55
SUM : 3
SUM : 6
SUM : 10
SUM : 15
SUM : 21
SUM : 28
SUM : 36
SUM : 45
SUM : 10
SUM : 15
SUM : 21
SUM : 28
SUM : 36
SUM : 45
SUM : 15
SUM : 21
SUM : 28
SUM : 36
SUM : 45
SUM : 21
SUM : 28
SUM : 36
SUM : 45
SUM : 28
SUM : 36
SUM : 45
SUM : 36
SUM : 45
SUM : 45
maxsum is : 55
