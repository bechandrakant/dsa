package Arrays.RotateArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    void rotate() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int K = 3;
        int[] expected = { 6, 7, 8, 1, 2, 3, 4, 5};
        int[] actual = new RotateArray().rotate(arr, K);
        assertArrayEquals(expected, actual);
    }
}