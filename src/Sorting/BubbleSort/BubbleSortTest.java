package Sorting.BubbleSort;

import Sorting.BubbleSort.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void testBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = { 1, -2, 4, 8, 5, 3, 9};
        int[] expected = {-2, 1, 3, 4, 5, 8, 9};
        int[] actual = bubbleSort.sort(input);
        assertArrayEquals(expected, actual);
    }
}