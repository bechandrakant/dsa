package Arrays.PairSum;

public class PairSum {

    // Find if there exists a pair, such that
    // arr[i] + arr[j] = K, i != j
    // No extra space, No built-in library
    public boolean hasPairSum(int[] arr, int target) {
        // Idea: Search in upper / lower triangle
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
