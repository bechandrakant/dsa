package Arrays.MaxSubarraySumK;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubarraySumKTest {

    @Test
    void maxSubarraySum() {
        MaxSubarraySumK maxSum = new MaxSubarraySumK();
        int[] arr = {1, 3, -4, 5, 6, 2, -1, 15};
        int K = 3;
        int expected = 16;
        int actual = maxSum.maxSubarraySum(arr, K);
        assertEquals(expected, actual);
    }

    @Test
    void maxSubarraySumSingleElement() {
        MaxSubarraySumK maxSum = new MaxSubarraySumK();
        int[] arr = {1};
        int K = 1;
        int expected = 1;
        int actual = maxSum.maxSubarraySum(arr, K);
        assertEquals(expected, actual);
    }

    @Test
    void maxSubarraySumLargeInput() {
        MaxSubarraySumK maxSum = new MaxSubarraySumK();
        int[] arr = new int[99999];
        for (int i = 0; i < 99999; i++) {
            arr[i] = i % 2;
        }
        int K = 5000;
        int expected = 2500;
        int actual = maxSum.maxSubarraySum(arr, K);
        assertEquals(expected, actual);
    }
}