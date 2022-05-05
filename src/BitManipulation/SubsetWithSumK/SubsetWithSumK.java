package BitManipulation.SubsetWithSumK;

public class SubsetWithSumK {

    // TC: 2^N
    public boolean hasSubsetWithSumK(int[] input, int target) {
        // Consider all subset from 0 to 2^N - 1
        int limit = (int)Math.pow(2, input.length);
        for (int i = 0; i < limit; i++) {
            int sum = 0;
            for (int j = 0; j < input.length; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += input[j];
                }
            }
            if (sum == target) return true;
        }
        return false;
    }
}
