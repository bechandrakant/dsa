package BitManipulation.MissingNumber2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumber2Test {

    @Test
    void findMissingNumbers() {
        int[] input = {1, 2, 3, 5, 7, 8};
        int[] expected = {4, 6};
        int[] actual = new MissingNumber2().findMissingNumbers(input);
        assertArrayEquals(expected, actual);
    }
}