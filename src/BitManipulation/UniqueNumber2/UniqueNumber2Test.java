package BitManipulation.UniqueNumber2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumber2Test {

    @Test
    void uniqueNumbers() {
        int[] arr = {1, 3, 4, 5, 1, 2, 3, 5};
        UniqueNumber2 uniqueNumber2 = new UniqueNumber2();
        int[] actual = uniqueNumber2.uniqueNumbers(arr);
        int[] expected = {2, 4};
        assertArrayEquals(expected, actual);
    }
}