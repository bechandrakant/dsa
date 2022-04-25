package BitManipulation.CountSetBits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSetBitsTest {

    @Test
    void countSetBits() {
        CountSetBits countSetBits = new CountSetBits();
        int num = 15;
        int expected = 4;
        int actual = countSetBits.countSetBits(num);
        assertEquals(expected, actual);
    }

    @Test
    void countSetBits2() {
        CountSetBits countSetBits = new CountSetBits();
        int num = 15;
        int expected = 4;
        int actual = countSetBits.countSetBits2(num);
        assertEquals(expected, actual);
    }

    @Test
    void countSetBits3() {
        CountSetBits countSetBits = new CountSetBits();
        int num = 15;
        int expected = 4;
        int actual = countSetBits.countSetBits(num);
        assertEquals(expected, actual);
    }

}