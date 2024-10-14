package PrefixArray;

public class maximumProductSubArray {
    public static void main(String[] args) {

    }
    long maxProduct(int[] arr) {
        int n =arr.length;
        // code here
        long maxproduct = arr[0];
        long max = arr[0];
        long min = arr[0];
        for (int i = 1; i<n; i++){
            if(arr[i] < 0){
                long temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);
            maxproduct = Math.max(maxproduct,max);
        }
        return maxproduct;
    }
   /* Initialization:

    maxproduct is initialized to the first element of the array.
    max and min are also initialized to the first element.
    Loop through the array:

    The loop starts from the second element (index 1) and goes to the end of the array.
    Dry Run Example
    Let's use an example array: arr = [2, 3, -2, 4].

    Initial State:
    maxproduct = 2
    max = 2
    min = 2
    Iteration 1 (i = 1, arr[i] = 3):
    arr[i] is positive, so no swap needed.
            max = Math.max(3, 2 * 3) = Math.max(3, 6) = 6
    min = Math.min(3, 2 * 3) = Math.min(3, 6) = 3
    maxproduct = Math.max(2, 6) = 6
    Iteration 2 (i = 2, arr[i] = -2):
    arr[i] is negative, so we swap max and min.
            Swap: temp = max (6), now max = 3, min = 6
    Now calculate:
    max = Math.max(-2, 3 * -2) = Math.max(-2, -6) = -2
    min = Math.min(-2, 6 * -2) = Math.min(-2, -12) = -12
    maxproduct = Math.max(6, -2) = 6
    Iteration 3 (i = 3, arr[i] = 4):
    arr[i] is positive, so no swap needed.
            max = Math.max(4, -2 * 4) = Math.max(4, -8) = 4
    min = Math.min(4, -12 * 4) = Math.min(4, -48) = -48
    maxproduct = Math.max(6, 4) = 6
    Final Result
    After finishing the loop, the maximum product found is 6.

    Summary
    The function will return 6 for the input array [2, 3, -2, 4]. The logic
    effectively tracks the potential maximum and minimum products at each step, allowing it to handle negative numbers correctly.
}*/
}
