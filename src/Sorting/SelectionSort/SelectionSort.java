package Sorting.SelectionSort;

public class SelectionSort {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int minElement = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minElement) {
                    minIndex = j;
                    minElement = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
