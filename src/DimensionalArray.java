public class DimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        // Filling the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) { // Diagonal elements
                    matrix[i][j] = i;
                } else {
                    matrix[i][j] = 0; // Non-diagonal elements
                }
            }
        }

        // Printing the matrix
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Calculating the sum of diagonal elements
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Sum of diagonal elements: " + sum);
    }
}

