package BitManipulation;

public class UniqueNumber {
    /**
     * Gets unique number from array which has every other element repeating twice
     * @param arr
     * @return uniqueNumber
     */
    public int getUniqueNumber(int[] arr) {
        int uniqueNumber = 0;
        for (int n: arr) {
            uniqueNumber ^= n;
        }
        return uniqueNumber;
    }
}
