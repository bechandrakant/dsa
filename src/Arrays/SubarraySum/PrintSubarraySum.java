package Arrays.SubarraySum;

public class PrintSubarraySum {

    public static void printAllSubarraySum(int[] arr) {
        // Brute Force: For every subarray calculate sum and print it
        // TC: O(n^3), SC: O(1)
        bruteForce(arr);

        // Carry Forward Technique: Using result of previous iteration in next
        // TC: O(n^2), SC: O(1)
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                System.out.println("Sum of subarray from index " + i + " to " + j + " = " + sum);
            }
        }
    }

    private static void bruteForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println("Sum of subarray from index " + i + " to " + j + " = " + sum);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printAllSubarraySum(arr);
    }
}
