package BitManipulation.UniqueNumber2;

public class UniqueNumber2 {
    // Every element repeats twice except 2, find these numbers
    public int[] uniqueNumbers(int[] arr) {
        // Get xor of 2 values
        int xor = 0;
        for (int n: arr) {
            xor ^= n;
        }
        // Find any set bit position
        int position = 0;
        for (int i = 0; i < 31; i++) {
            if ((xor & (1 << i)) != 0) {
                position = i;
                break;
            }
        }
        // Divide array based on set bit position
        int set = 0, unset = 0;
        for (int n: arr) {
            if ((n & (1 << position)) != 0) {
                set ^= n;
            } else {
                unset ^= n;
            }
        }
        int[] result = {Math.min(set, unset), Math.max(set, unset)};
        return result;
    }
}
