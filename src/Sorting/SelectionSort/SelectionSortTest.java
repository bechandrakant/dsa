package Sorting.SelectionSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void testSelectionSort() {
        SelectionSort selectionSort = new SelectionSort();
        int[] input = { 1, -2, 4, 8, 5, 3, 9};
        int[] expected = {-2, 1, 3, 4, 5, 8, 9};
        int[] actual = selectionSort.sort(input);
        assertArrayEquals(expected, actual);
    }
}