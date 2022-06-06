package Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    Matrix matrix = new Matrix();
    @Test
    void testAddMatrix() {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] B = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        int[][] expected = {
                {8, 10, 12},
                {8, 10, 12},
                {8, 10, 12},
        };
        int[][] actual = matrix.addMatrix(A, B);
        assertArrayEquals(expected, actual);
    }
}