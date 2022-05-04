package BitManipulation.MinimumXOR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumXORTest {

    @Test
    void lessSetBit() {
        MinimumXOR minimumXOR = new MinimumXOR();
        int a = 3, b = 3;
        int expected = 7;
        int actual = minimumXOR.getMinimumXOR(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void moreSetBit() {
        MinimumXOR minimumXOR = new MinimumXOR();
        int a = 3, b = 1;
        int expected = 2;
        int actual = minimumXOR.getMinimumXOR(a, b);
        assertEquals(expected, actual);
    }

}