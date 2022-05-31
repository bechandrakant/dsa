package Arrays.MaxSubarraySum;

public class MaxSubarraySum {
    // Q. Find the contiguous non-empty subarray
    // of length N, which has largest sum
    public int maxSubarraySum(int[] arr) {
        // Kadane's Algo
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int n: arr) {
            sum += n;
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}
