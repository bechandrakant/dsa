package Arrays.RotateArray;

public class RotateArray {

    // Rotate given array K times
    // TC: O(n), SC: O(1)
    public int[] rotate(int[] arr, int K) {
        // Reverse array
        int N = arr.length;
        for (int i = 0; i < N / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[N - i - 1];
            arr[N - i - 1] = temp;
        }
        // Reverse first K elements
        for (int i = 0; i < K / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[K - i - 1];
            arr[K - i - 1] = temp;
        }
        // Reverse last N - K elements
        for (int i = K; i < K + (N - K) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[N + K - i - 1];
            arr[N + K - i - 1] = temp;
        }
        return arr;
    }

}
