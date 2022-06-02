package Arrays.PrefixSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrefixSumTest {
    PrefixSum prefixSum = new PrefixSum();
    @Test
    void sumLtoR() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[][] queries = {
                {0, 2},
                {2, 5},
                {0, 7},
                {3, 6},
                {1, 4},
        };
        int[] expected = {6, 18, 36, 22, 14};
        int[] actual = prefixSum.sumLtoR(arr, queries);
        assertArrayEquals(expected, actual);
    }

    @Test
    void addXfromLtoR() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[][] queries = {
                {0, 2, 2},
                {2, 5, 3},
                {0, 7, 4},
                {3, 6, 5},
                {1, 4, 6},
        };
        int[] expected = {7, 14, 18, 22, 23, 18, 16, 12};
        int[] actual = prefixSum.addXfromLtoR(arr, queries);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testLeftMax() {
        int[] input = {7, 14, 18, 22, 23, 18, 16, 12};
        int[] expected = {7, 14, 18, 22, 23, 23, 23, 23};
        int[] actual = prefixSum.leftMax(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testRightMax() {
        int[] input = {7, 14, 18, 22, 23, 18, 16, 12};
        int[] expected = {23, 23, 23, 23, 23, 18, 16, 12};
        int[] actual = prefixSum.rightMax(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testCountOfAGPairs() {
        String word = "abcgag";
        int expected = 3;
        int actual = prefixSum.countOfAGPairs(word);
        assertEquals(expected, actual);
    }

    @Test
    void testClosestMinMax() {
        int[] input = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3};
        int expected = 4;
        int actual = prefixSum.closestMinMax(input);
        assertEquals(expected, actual);
    }

    @Test
    void testFindCountOfEquilibriumIndex() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int expected = 1;
        int actual = prefixSum.findCountOfEquilibriumIndex(input);
        assertEquals(expected, actual);
    }

    @Test
    void testFindCountOfEquilibriumIndexZeroCase() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = 0;
        int actual = prefixSum.findCountOfEquilibriumIndex(input);
        assertEquals(expected, actual);
    }

    @Test
    void testFairArray() {
        int[] input = {2,1,6,4};
        int expected = 1;
        int actual = prefixSum.fairArray(input);
        assertEquals(expected, actual);
    }

    @Test
    void testFairArrayNoSuchIndex() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = 0;
        int actual = prefixSum.fairArray(input);
        assertEquals(expected, actual);
    }
}