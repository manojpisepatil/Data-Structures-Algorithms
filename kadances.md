# 🔢 Kadane's Algorithm – Maximum Subarray Sum (Java)

This program demonstrates **Kadane's Algorithm**, an efficient technique to find the **maximum subarray sum** in a given integer array.

---

## 📌 Problem Statement

Given an array of integers, find the contiguous subarray (containing at least one number) which has the **largest sum** and return its sum.

---

## 📋 Java Code

```java
public class kadances {
    public static void main(String args[]){
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int maxsum = kadane(arr);
        System.out.println("Highest subarray sum is : "+maxsum);
    }

    public static int kadane(int arr[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            if(sum < 0){
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
```
## Sample Output
```
input  : arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
output : Highest subarray sum is : 55
