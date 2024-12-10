import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmsTest {

    @Test
    public void testBinarySearch() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, Algorithms.binarySearch(array, 5));
        assertEquals(-1, Algorithms.binarySearch(array, 4));
        assertEquals(0, Algorithms.binarySearch(array, 1));
        assertEquals(4, Algorithms.binarySearch(array, 9));
        assertEquals(-1, Algorithms.binarySearch(new int[]{}, 3));
    }

    @Test
    public void testDeterminant() {
        int[][] matrix2x2 = {{1, 2}, {3, 4}};
        assertEquals(-2, Algorithms.determinant(matrix2x2));

        int[][] matrix3x3 = {
            {6, 1, 1},
            {4, -2, 5},
            {2, 8, 7}
        };
        assertEquals(-306, Algorithms.determinant(matrix3x3));
    }

    @Test
    public void testMultiplyMatrices() {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{2, 0}, {1, 2}};
        int[][] expected = {{4, 4}, {10, 8}};
        assertArrayEquals(expected, Algorithms.multiplyMatrices(matrixA, matrixB));
    }
}
