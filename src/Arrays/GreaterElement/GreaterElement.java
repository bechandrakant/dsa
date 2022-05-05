package Arrays.GreaterElement;

public class GreaterElement {

    // Frequency Counter Pattern
    // Count number of elements having at least one element greater than itself
    public int count(int[] arr) {
        // Intuition: totalElementCount - countOfMax
        int totalElementCount = arr.length;
        int countOfMax = 0;
        int max = arr[0];

        for (int n: arr) {
            if (n == max) {
                countOfMax++;
            }
            if (n > max) {
                max = n;
                countOfMax = 1;
            }
        }
        return totalElementCount - countOfMax;
    }
}
