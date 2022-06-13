package Matrix;

import java.util.ArrayList;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrixInput = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        Matrix matrix = new Matrix();
        matrix.printRowWise(matrixInput);
        matrix.printColumnWise(matrixInput);
    }

    public void printRowWise(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printColumnWise(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public int[][] addMatrix(int[][] A, int[][] B) {
        // Check for dimensions
        if (A.length != B.length || A[0].length != B[0].length) {
            throw new IllegalArgumentException("Dimensions of both matrices must be same");
        }
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public int[][] subtractMatrix(int[][] A, int[][] B) {
        // Check for dimensions
        if (A.length != B.length || A[0].length != B[0].length) {
            throw new IllegalArgumentException("Dimensions of both matrices must be same");
        }
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public int[][] multiplyMatrix(int[][] A, int[][] B) {
        if (A.length != B[0].length && A[0].length != B.length) {
            throw new IllegalArgumentException("Number of rows in A must be equal to columns in B and vice versa");
        }
        int[][] result = new int[A.length][B[0].length];

        for(int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                int sum = 0;
                for (int k = 0; k < B.length; k++) {
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    public int[] getLtoRdiagonal(int[][] matrix) {
        int[] diagonal = new int[Math.min(matrix.length, matrix[0].length)];
        for (int i = 0; i < Math.min(matrix.length, matrix[0].length); i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getRtoLdiagonal(int[][] matrix) {
        int minLength = Math.min(matrix.length, matrix[0].length);
        int[] diagonal = new int[minLength];
        for (int i = 0; i < minLength; i++) {
            diagonal[i] = matrix[i][matrix[0].length - i - 1];
        }
        return diagonal;
    }

    public int[][] allLtoRdiagonal(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] diagonals = new int[rows + columns - 1][];
        int diagonalsPointer = 0;
        for (int index = columns - 1; index > (-1 * rows); index--) {
            int i = index < 0 ? Math.abs(index): 0; // start position rows
            int j = index < 0 ? 0: index; // start position columns

            ArrayList<Integer> diagonal = new ArrayList<>();

            while (i < rows && j < columns) {
                diagonal.add(matrix[i][j]);
                i++;
                j++;
            }
            diagonals[diagonalsPointer++] = diagonal.stream().mapToInt(ele -> ele).toArray();
        }
        return diagonals;
    }

    public int[][] allRtoLdiagonal(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] diagonals = new int[rows + columns - 1][];
        for (int indexSum = 0; indexSum < rows + columns - 1; indexSum++) {
            int i = indexSum < columns ? 0: indexSum - columns + 1; // start position rows
            int j = indexSum < columns ? indexSum: indexSum - i; // start position columns

            ArrayList<Integer> diagonal = new ArrayList<>();

            while (i < rows && j >= 0) {
                diagonal.add(matrix[i][j]);
                i++;
                j--;
            }
            diagonals[indexSum] = diagonal.stream().mapToInt(ele -> ele).toArray();
        }
        return diagonals;
    }

    public int[][] transpose(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    public int[][] rotate90deg(int[][] matrix) {
        int[][] rotated = new Matrix().transpose(matrix);

        // Swap rowwise
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated[i].length / 2; j++) {
                int temp = rotated[i][j];
                rotated[i][j] = rotated[i][rotated[i].length - j - 1];
                rotated[i][rotated[i].length - j - 1] = temp;
            }
        }

        return rotated;
    }
}
