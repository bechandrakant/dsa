package BitManipulation.CheckSetBit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSetBitTest {

    @Test
    void checkSetBit() {
        CheckSetBit checkSetBit = new CheckSetBit();
        boolean actual = checkSetBit.checkSetBit(11, 2);
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void checkSetBit2() {
        CheckSetBit checkSetBit = new CheckSetBit();
        boolean actual = checkSetBit.checkSetBit2(11, 2);
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void checkSetBit3() {
        CheckSetBit checkSetBit = new CheckSetBit();
        boolean actual = checkSetBit.checkSetBit3(11, 2);
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void checkSetBit4() {
        CheckSetBit checkSetBit = new CheckSetBit();
        boolean actual = checkSetBit.checkSetBit4(11, 2);
        boolean expected = false;
        assertEquals(expected, actual);
    }

}