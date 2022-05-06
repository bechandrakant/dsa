package Arrays.PairSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairSumTest {

    @Test
    void hasPairSum() {
        int[] arr = {1, 4, 8, 9, 15, 16};
        int target = 23;
        boolean expected = true;
        boolean actual = new PairSum().hasPairSum(arr, target);
        assertEquals(expected, actual);
    }

    @Test
    void dontHavePairSum() {
        int[] arr = {1, 4, 8, 9, 15, 16};
        int target = 22;
        boolean expected = false;
        boolean actual = new PairSum().hasPairSum(arr, target);
        assertEquals(expected, actual);
    }
}