package BitManipulation.SumAllXORPairs;

public class SumAllXORPairs {

    // Sum of all possible XOR pairs in array
    public int getSumAllXORPairs(int[] input) {
        int ans = 0;
        for (int i = 0; i < 31; i++) {
            int count = 0; // Count of elemnts with ith bit set
            for (int n: input) {
                if (((n >> i) & 1) == 1) {
                    count++;
                }
            }
            ans += count * (input.length - count) * (1 << i);
        }
        return 2 * ans;
    }
}
