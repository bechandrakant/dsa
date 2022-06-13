package Matrix.SpiralMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {

    @Test
    void testSquareSpiralMatrix() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] input = {
                {11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22},
                {23, 24, 25, 26, 27, 28},
                {29, 30, 31, 32, 33, 34},
                {35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46}
        };
        int[] expected = {
                11, 12, 13, 14, 15, 16, 22, 28, 34, 40, 46, 45, 44, 43, 42, 41, 35, 29, 23, 17, 18, 19, 20, 21,
                27, 33, 39, 38, 37, 36, 30, 24, 25, 26, 32, 31
        };

        int[] actual = spiralMatrix.spiralMatrix(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testRectangle1SpiralMatrix() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] input = {
                {11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22},
                {23, 24, 25, 26, 27, 28}
        };
        int[] expected = {
                11, 12, 13, 14, 15, 16, 22, 28, 27, 26, 25, 24, 23, 17, 18, 19, 20, 21
        };
        int[] actual = spiralMatrix.spiralMatrix(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testRectangle2SpiralMatrix() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] input = {
                {11, 12, 13},
                {17, 18, 19},
                {23, 24, 25},
                {29, 30, 31},
                {35, 36, 37},
                {41, 42, 43}
        };
        int[] expected = {
                11, 12, 13, 19, 25, 31, 37, 43, 42, 41, 35, 29, 23, 17, 18, 24, 30, 36
        };

        int[] actual = spiralMatrix.spiralMatrix(input);
        assertArrayEquals(expected, actual);
    }
}