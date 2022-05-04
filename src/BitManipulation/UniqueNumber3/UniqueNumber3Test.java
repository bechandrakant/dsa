package BitManipulation.UniqueNumber3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumber3Test {

    @Test
    void uniqueNumberWithAllPositiveInput() {
        int[] input = {1, 2, 3, 4, 5, 1, 3, 4, 5, 1, 4, 3, 5};

        UniqueNumber3 uniqueNumber = new UniqueNumber3();
        int expected = 2;
        int actual = uniqueNumber.uniqueNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    void uniqueNumber() {
        int[] input = {-1, -2, 3, -4, 5, -1, 3, -4, 5, -1, -4, 3, 5};

        UniqueNumber3 uniqueNumber = new UniqueNumber3();
        int expected = -2;
        int actual = uniqueNumber.counterIntutive(input);
        assertEquals(expected, actual);
    }

}