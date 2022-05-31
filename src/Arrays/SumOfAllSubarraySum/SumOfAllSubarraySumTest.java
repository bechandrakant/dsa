package Arrays.SumOfAllSubarraySum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfAllSubarraySumTest {

    @Test
    void sumOfAllSubarrays() {
        SumOfAllSubarraySum sum = new SumOfAllSubarraySum();
        int[] arr = {1, 2, 3, 4, 5};
        int expected = 105;
        int actual = sum.sumOfAllSubarrays(arr);
        assertEquals(expected, actual);
    }
}