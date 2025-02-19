import java.util.Random;
import java.util.Scanner;

public class matrixmanipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row: ");
        int row = sc.nextInt();
        System.out.println("Enter Column: ");
        int col = sc.nextInt();

        int[][] matrix1 = generateRandomMatrix(row, col);
        int[][] matrix2 = generateRandomMatrix(row, col);

        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nMatrix Addition:");
        displayMatrix(addTwoMatrices(matrix1, matrix2));

        System.out.println("\nMatrix Subtraction:");
        displayMatrix(subtractTwoMatrices(matrix1, matrix2));

        System.out.println("\nMatrix Multiplication:");
        displayMatrix(multiplyTwoMatrices(matrix1, matrix2));

        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        if (row == 2 && col == 2) {
            System.out.println("\nDeterminant of Matrix 1: " + determinantOf2x2Matrix(matrix1));
            System.out.println("\nInverse of Matrix 1:");
            displayMatrix(inverseOf2x2Matrix(matrix1));
        }

        sc.close();
    }

    // Generate a random matrix
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Generates numbers between 0-9
            }
        }
        return matrix;
    }

    // Matrix Addition
    public static int[][] addTwoMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Matrix Subtraction
    public static int[][] subtractTwoMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Matrix Multiplication
    public static int[][] multiplyTwoMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length, cols1 = matrix1[0].length;
        int rows2 = matrix2.length, cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            System.out.println("Multiplication not possible: Columns of matrix1 must match rows of matrix2.");
            return new int[0][0];
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Transpose of a Matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Determinant of 2x2 Matrix
    public static int determinantOf2x2Matrix(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            System.out.println("Matrix must be 2x2 to calculate determinant.");
        }
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Inverse of 2x2 Matrix
    public static double[][] inverseOf2x2Matrix(int[][] matrix) {
        int determinant = determinantOf2x2Matrix(matrix);
        if (determinant == 0) {
            System.out.println("Matrix is singular (determinant is 0), inverse does not exist.");
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;

        return inverse;
    }

    // Display Matrix
    public static void displayMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            System.out.println("No matrix to display.");
            return;
        }
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    // Display Matrix (for double values - inverse)
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double num : row) {
                System.out.printf("%8.3f", num);
            }
            System.out.println();
        }
    }
}
