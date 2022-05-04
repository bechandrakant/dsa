package BitManipulation.UniqueNumber3;

public class UniqueNumber3 {
    // Every element repeats thrice except 1, find unique number
    public int uniqueNumber(int[] input) {
        // Idea: for each bit count, 3x or 3x + 1
        int unique = 0;
        for (int i = 0; i < 31; i++) {
            int count = 0;
            for (int n: input) {
                if ((n & (1 << i)) != 0) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                unique = unique | (1 << i);
            }
        }
        return unique;
    }

    public int counterIntutive(int[] input) {
        int ones = 0;
        int twos = 0;
        for (int num: input) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}
