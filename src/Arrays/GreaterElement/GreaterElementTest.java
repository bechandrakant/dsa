package Arrays.GreaterElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreaterElementTest {

    @Test
    void count() {
        int[] input = {9, 4, 5, 6, 2, 8, 8};
        int expected = 6;
        int actual = new GreaterElement().count(input);
        assertEquals(expected, actual);
    }
}