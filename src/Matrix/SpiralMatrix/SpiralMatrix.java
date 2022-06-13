package Matrix.SpiralMatrix;

import java.util.ArrayList;

public class SpiralMatrix {
    public int[] spiralMatrix(int[][] matrix) {
        ArrayList<Integer> spiralData = new ArrayList<>();

        int i = 0;
        int j = 0;
        int columns = matrix[0].length;
        int rows = matrix.length;

        while (rows > 1 && columns > 1) {
            // Top row
            for (int k = 0; k < columns - 1; k++) {
                spiralData.add(matrix[i][j]);
                j++;
            }
            // Right column
            for (int k = 0; k < rows - 1; k++) {
                spiralData.add(matrix[i][j]);
                i++;
            }
            // Bottom row
            for (int k = 0; k < columns - 1; k++) {
                spiralData.add(matrix[i][j]);
                j--;
            }
            // Left column
            for (int k = 0; k < rows - 1; k++) {
                spiralData.add(matrix[i][j]);
                i--;
            }
            i++;
            j++;
            rows -= 2;
            columns -= 2;
        }

        if (rows == 0 || columns == 0) {
            return spiralData.stream().mapToInt(element -> element).toArray();
        }

        if (rows == 1 || columns == 1) {
            if (rows > 1) {
                for (int k = 0; k < rows; k++) {
                    spiralData.add(matrix[i][j]);
                    i++;
                }
            } else {
                for (int k = 0; k < columns; k++) {
                    spiralData.add(matrix[i][j]);
                    j++;
                }
            }
        }

        return spiralData.stream().mapToInt(element -> element).toArray();
    }
}
