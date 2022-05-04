package BitManipulation.MinimumXOR;

public class MinimumXOR {

    /*
     * Given two integers a and b, find a number X such that
     * A ^ X is minimum and number of set bits in X equals B
     */
    public int getMinimumXOR(int a, int b) {
        int x = a;
        // Count set bits in a
        int count = 0;
        while (x > 0) {
            count++;
            x = x & (x - 1);
        }
        x = a;
        if (count < b) {
            int diff = b - count;
            for (int i = 0; i < 31; i++) {
                if ((x & (1 << i)) == 0) {
                    x = x | (1 << i);
                    diff--;
                }
                if (diff == 0) {
                    break;
                }
            }
        } else if (count > b) {
            int diff = count - b;
            for (int i = 0; i < 31; i++) {
                if ((x & (1 << i)) != 0) {
                    x = x ^ (1 << i);
                    diff--;
                }
                if (diff == 0) {
                    break;
                }
            }
        }
        return x;
    }
}
