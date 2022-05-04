package BitManipulation.SumAllXORPairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumAllXORPairsTest {

    @Test
    void getSumAllXORPairs() {
        int[] input = {3, 5, 6, 8};
        int expected = 104;
        int actual = new SumAllXORPairs().getSumAllXORPairs(input);
        assertEquals(expected, actual);
    }
}