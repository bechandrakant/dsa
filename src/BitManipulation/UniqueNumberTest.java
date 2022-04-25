package BitManipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberTest {

    @Test
    void getUniqueNumber() {
        UniqueNumber uniqueNumber = new UniqueNumber();
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 3, 4, 5, 6};
        int expected = 2;
        int actual = uniqueNumber.getUniqueNumber(arr);
        assertEquals(expected, actual);
    }
}