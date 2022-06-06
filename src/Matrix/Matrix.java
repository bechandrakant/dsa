package Matrix;

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
}
