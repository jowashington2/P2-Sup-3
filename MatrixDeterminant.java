public class Algorithms {

    /**
     * Calculates the determinant of a square matrix.
     * @param matrix A 2D array representing a square matrix.
     * @return The determinant of the matrix.
     * @throws IllegalArgumentException If the matrix is not square.
     */
    public static int determinant(int[][] matrix) {
        int n = matrix.length;
        if (!isSquareMatrix(matrix)) {
            throw new IllegalArgumentException("Matrix must be square");
        }
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        int det = 0;
        for (int col = 0; col < n; col++) {
            det += (col % 2 == 0 ? 1 : -1) * matrix[0][col] * determinant(minor(matrix, col));
        }
        return det;
    }

    private static boolean isSquareMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            if (row.length != matrix.length) {
                return false;
            }
        }
        return true;
    }

    private static int[][] minor(int[][] matrix, int colToRemove) {
        int n = matrix.length;
        int[][] minor = new int[n - 1][n - 1];
        for (int i = 1; i < n; i++) {
            int colCount = 0;
            for (int j = 0; j < n; j++) {
                if (j == colToRemove) continue;
                minor[i - 1][colCount++] = matrix[i][j];
            }
        }
        return minor;
    }
}
