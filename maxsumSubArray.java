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
