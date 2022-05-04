package BitManipulation.PowerOfTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    @Test
    void isPowerOfTwo() {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        int input = 16;
        boolean expected = true;
        boolean actual = powerOfTwo.isPowerOfTwo(input);
        assertEquals(expected, actual);
    }

    @Test
    void notPowerOfTwo() {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        int input = 15;
        boolean expected = false;
        boolean actual = powerOfTwo.isPowerOfTwo(input);
        assertEquals(expected, actual);
    }

}