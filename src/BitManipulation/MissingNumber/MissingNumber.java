package BitManipulation.MissingNumber;

public class MissingNumber {

    // All numbers are present from 1 to N + 1, except 1
    public int missingNumber(int[] input) {
        // Idea: XOR with 1 to N + 1
        int max = 0;
        int missingNum = 0;
        for (int n: input) {
            missingNum ^= n;
            max = Math.max(max, n);
        }

        for (int i = 1; i <= max; i++) {
            missingNum ^= i;
        }

        return missingNum;
    }
}
