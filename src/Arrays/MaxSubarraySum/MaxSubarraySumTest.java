package Arrays.MaxSubarraySum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubarraySumTest {
    MaxSubarraySum maxSubarraySum = new MaxSubarraySum();

    @Test
    void maxSubarraySumPositiveElements() {
        int[] arr = {1, 2, 3, 4, 5};
        int expected = 15;
        int actual = maxSubarraySum.maxSubarraySum(arr);
        assertEquals(expected, actual);
    }

    @Test
    void maxSubarraySumNegativeElements() {
        int[] arr = {-2, -3, -1, -4, -5};
        int expected = -1;
        int actual = maxSubarraySum.maxSubarraySum(arr);
        assertEquals(expected, actual);
    }

    @Test
    void maxSubarraySumMixElements() {
        int[] arr = {-2, -3, 1, -4, -5};
        int expected = 1;
        int actual = maxSubarraySum.maxSubarraySum(arr);
        assertEquals(expected, actual);
    }
}