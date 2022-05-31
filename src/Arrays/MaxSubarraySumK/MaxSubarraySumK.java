package Arrays.MaxSubarraySumK;

public class MaxSubarraySumK {
    // Q. Find max sub array sum of len = K
    public int maxSubarraySum(int[] arr, int K) {
        // Sliding window technique
        // TC: O(N), SC: O(1)
        int sum = 0;
        // Sum of first K elements
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        int maxSum = sum;

        for (int i = 1; i <= arr.length - K; i++) {
            sum = sum - arr[i - 1] + arr[i + K - 1];
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
