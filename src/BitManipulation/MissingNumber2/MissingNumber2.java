package BitManipulation.MissingNumber2;

public class MissingNumber2 {

    // Find missing numbers in array, if they are from 1 to N + 2
    public int[] findMissingNumbers(int[] input) {
        int max = 0;
        int xor = 0;
        for (int n: input) {
            max = Math.max(max, n);
            xor ^= n;
        }
        for (int i = 1; i <= max; i++) {
            xor ^= i;
        }
        // find first set bit position
        int position = 0;
        for (int i = 0; i < 31; i++) {
            if ((xor & (1 << i)) != 0) {
                position = i;
                break;
            }
        }
        int missingNum1 = 0, missingNum2 = 0;
        for (int n: input) {
            if ((n & (1 << position)) == 0) {
                missingNum1 ^= n;
            } else {
                missingNum2 ^= n;
            }
        }

        for (int i = 1; i <= max; i++) {
            if ((i & (1 << position)) == 0) {
                missingNum1 ^= i;
            } else {
                missingNum2 ^= i;
            }
        }

        return new int[]{Math.min(missingNum1, missingNum2), Math.max(missingNum1, missingNum2)};
    }
}
