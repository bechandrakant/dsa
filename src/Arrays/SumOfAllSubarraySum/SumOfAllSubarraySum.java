package Arrays.SumOfAllSubarraySum;

public class SumOfAllSubarraySum {
    // Given an array find sum of all subarrays
    public int sumOfAllSubarrays(int[] arr) {
        // Contribution technique
        // Number of array in which arr[i] is present = (i + 1) * (arr.length - i)
        // TC: O(n), SC: O(1)
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int contribution = arr[i] * (i + 1) * (arr.length - i);
            sum += contribution;
        }
        return sum;
    }
}
