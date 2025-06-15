public class MaxSubArrSum {
    //brute force approach
    public static void maxSubArrSumByBruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0; //reset the sum to 0 for each subarray
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                // maxSum = Math.max(maxSum, sum); // this is the java way to find the max sum but we use brute force to find the max sum
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }       
        }
        System.out.println(maxSum);
    }

    //prefix sum approach
    public static void maxSubArrSumByPrefixSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = (i == 0) ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1]; //this is the formula to find the sum of the subarray
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }

    //kadane's algorithm
    public static void maxSubArrSumByKadane(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            // alternate for finding max b/t sum and maxSum
            // if (sum > maxSum) { 
            //     maxSum = sum;
            // }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }



    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        maxSubArrSumByBruteForce(arr);
        maxSubArrSumByPrefixSum(arr);
        maxSubArrSumByKadane(arr);
    }

    
}
