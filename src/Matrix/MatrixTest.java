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

    @Test
    void testAddMatrixUnequalDimensions() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6}
        };
        int[][] B = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertThrows(IllegalArgumentException.class, () -> {
            matrix.addMatrix(A, B);
        });
    }

    @Test
    void testSubtractMatrix() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        int[][] B = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {6, 6, 6},
                {0, 0, 0},
                {-6, -6, -6},
        };
        int[][] actual = matrix.subtractMatrix(A, B);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSubtractMatrixUnequalDimensions() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6}
        };
        int[][] B = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertThrows(IllegalArgumentException.class, () -> {
            matrix.subtractMatrix(A, B);
        });
    }

    @Test
    void testMultiplyMatrix() {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };
        int[][] expected = {
                {58, 64},
                {139, 154}
        };
        int[][] actual = matrix.multiplyMatrix(A, B);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetLtoRDiagonalSquareMatrix() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        int[] expected = {7, 5, 3};
        assertArrayEquals(expected, matrix.getLtoRdiagonal(A));
    }

    @Test
    void testGetLtoRDiagonalRectangleMatrix() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3},
                {2, 2, 2},
        };
        int[] expected = {7, 5, 3};
        assertArrayEquals(expected, matrix.getLtoRdiagonal(A));
    }

    @Test
    void testGetLtoRDiagonalRectangleMatrix2() {
        int[][] A = {
                {7, 8, 9, 10},
                {4, 5, 6, 11},
                {1, 2, 3, 12}
        };
        int[] expected = {7, 5, 3};
        assertArrayEquals(expected, matrix.getLtoRdiagonal(A));
    }

    @Test
    void testGetRtoLDiagonalSquareMatrix() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        int[] expected = {9, 5, 1};
        assertArrayEquals(expected, matrix.getRtoLdiagonal(A));
    }

    @Test
    void testGetRtoLDiagonalRectangleMatrix() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3},
                {2, 2, 2},
        };
        int[] expected = {9, 5, 1};
        assertArrayEquals(expected, matrix.getRtoLdiagonal(A));
    }

    @Test
    void testGetRtoLDiagonalRectangleMatrix2() {
        int[][] A = {
                {7, 8, 9, 10},
                {4, 5, 6, 11},
                {1, 2, 3, 12}
        };
        int[] expected = {10, 6, 2};
        assertArrayEquals(expected, matrix.getRtoLdiagonal(A));
    }

    @Test
    void testAllRtoLDiagonalSquareMatrix() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        int[][] expected = {
                {7},
                {8, 4},
                {9, 5, 1},
                {6, 2},
                {3}
        };
        int[][] actual = matrix.allRtoLdiagonal(A);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAllRtoLDiagonalRectangleMatrix() {
        int[][] A = {
                {7, 8, 9, 10},
                {4, 5, 6, 11},
                {1, 2, 3, 12}
        };
        int[][] expected = {
                {7},
                {8, 4},
                {9, 5, 1},
                {10, 6, 2},
                {11, 3},
                {12}
        };
        int[][] actual = matrix.allRtoLdiagonal(A);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAllRtoLDiagonalRectangleMatrix2() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3},
                {2, 2, 2},
        };
        int[][] expected = {
                {7},
                {8, 4},
                {9, 5, 1},
                {6, 2, 2},
                {3, 2},
                {2}
        };
        int[][] actual = matrix.allRtoLdiagonal(A);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAllLtoRDiagonalSquareMatrix() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        int[][] expected = {
                {9},
                {8, 6},
                {7, 5, 3},
                {4, 2},
                {1}
        };
        int[][] actual = matrix.allLtoRdiagonal(A);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAllLtoRDiagonalRectangleMatrix() {
        int[][] A = {
                {7, 8, 9, 10},
                {4, 5, 6, 11},
                {1, 2, 3, 12}
        };
        int[][] expected = {
                {10},
                {9, 11},
                {8, 6, 12},
                {7, 5, 3},
                {4, 2},
                {1}
        };
        int[][] actual = matrix.allLtoRdiagonal(A);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAllLtoRDiagonalRectangleMatrix2() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3},
                {2, 2, 2},
        };
        int[][] expected = {
                {9},
                {8, 6},
                {7, 5, 3},
                {4, 2, 2},
                {1, 2},
                {2}
        };
        int[][] actual = matrix.allLtoRdiagonal(A);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTransposeSquareMatrix() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        int[][] actual = matrix.transpose(A);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTransposeRectangleMatrix() {
        int[][] A = {
                {7, 8, 9, 10},
                {4, 5, 6, 11},
                {1, 2, 3, 12}
        };
        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3},
                {10, 11, 12}
        };
        int[][] actual = matrix.transpose(A);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTransposeRectangleMatrix2() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3},
                {10, 11, 12}
        };
        int[][] expected = {
                {7, 4, 1, 10},
                {8, 5, 2, 11},
                {9, 6, 3, 12}
        };
        int[][] actual = matrix.transpose(A);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testRotate90degSquareMatrix() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        int[][] expected = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        int[][] actual = matrix.rotate90deg(A);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testRotate90degRectangleMatrix() {
        int[][] A = {
                {7, 8, 9, 10},
                {4, 5, 6, 11},
                {1, 2, 3, 12}
        };
        int[][] expected = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9},
                {12, 11, 10}
        };
        int[][] actual = matrix.rotate90deg(A);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testRotate90degRectangleMatrix2() {
        int[][] A = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3},
                {10, 11, 12}
        };
        int[][] expected = {
                {10, 1, 4, 7},
                {11, 2, 5, 8},
                {12, 3, 6, 9},
        };
        int[][] actual = matrix.rotate90deg(A);
        assertArrayEquals(expected, actual);
    }
}