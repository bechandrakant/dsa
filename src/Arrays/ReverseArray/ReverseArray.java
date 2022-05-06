package Arrays.ReverseArray;

public class ReverseArray {

    // Reverse an array
    public int[] reverse(int[] arr) {
        // Idea: iterate to half
        int N = arr.length;
        for (int i = 0; i < N / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[N - i - 1];
            arr[N - i - 1] = temp;
        }
        return arr;
    }
}
