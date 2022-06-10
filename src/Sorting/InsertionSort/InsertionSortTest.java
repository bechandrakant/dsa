package Sorting.InsertionSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void testInsertionSort() {
        InsertionSort insertionSort = new InsertionSort();
        int[] input = { 1, -2, 4, 8, 5, 3, 9};
        int[] expected = {-2, 1, 3, 4, 5, 8, 9};
        int[] actual = insertionSort.sort(input);
        assertArrayEquals(expected, actual);
    }
}