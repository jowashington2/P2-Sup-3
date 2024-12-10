public class Algorithms {

    /**
     * Multiplies two matrices.
     * @param matrixA The first matrix.
     * @param matrixB The second matrix.
     * @return The resulting matrix after multiplication.
     * @throws IllegalArgumentException If matrix dimensions are incompatible.
     */
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length, colsA = matrixA[0].length;
        int rowsB = matrixB.length, colsB = matrixB[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix dimensions are incompatible for multiplication");
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }
}
