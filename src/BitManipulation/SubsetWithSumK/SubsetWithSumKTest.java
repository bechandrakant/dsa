package BitManipulation.SubsetWithSumK;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsetWithSumKTest {

    @Test
    void hasSubsetWithSumK() {
        int[] input = {3, 5, 9};
        int target = 8;
        boolean expected = true;
        boolean actual = new SubsetWithSumK().hasSubsetWithSumK(input, target);
        assertEquals(expected, actual);
    }

    @Test
    void dontHaveSubsetWithSumK() {
        int[] input = {3, 5, 9};
        int target = 4;
        boolean expected = false;
        boolean actual = new SubsetWithSumK().hasSubsetWithSumK(input, target);
        assertEquals(expected, actual);
    }
}