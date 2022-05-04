package BitManipulation.MissingNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void missingNumber() {
        MissingNumber missingNumber = new MissingNumber();
        int[] input = {1, 2, 3, 5, 6};
        int expected = 4;
        int actual = missingNumber.missingNumber(input);
        assertEquals(expected, actual);
    }

}