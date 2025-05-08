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

## Explanation
```
For subarray from index 0 to 0: sum = prefix[0] = 1

For subarray from index 0 to 1: sum = prefix[1] = 3

For subarray from index 0 to 2: sum = prefix[2] = 6

For subarray from index 0 to 3: sum = prefix[3] = 10

For subarray from index 0 to 4: sum = prefix[4] = 15

For subarray from index 0 to 5: sum = prefix[5] = 21

For subarray from index 0 to 6: sum = prefix[6] = 28

For subarray from index 0 to 7: sum = prefix[7] = 36

For subarray from index 0 to 8: sum = prefix[8] = 45

For subarray from index 0 to 9: sum = prefix[9] = 55
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
```
