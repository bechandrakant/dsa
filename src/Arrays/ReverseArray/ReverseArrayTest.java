package Arrays.ReverseArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    void reverseOddNumberOfElements() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] actual = new ReverseArray().reverse(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    void reverseEvenNumberOfElements() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] actual = new ReverseArray().reverse(arr);
        assertArrayEquals(expected, actual);
    }
}