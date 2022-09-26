package Arrays2D;

// Write a program to FindTransposeofa Matrix.What is Transpose?
// Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix,
public class Q3_2DArray {
    public static void PrintMatrix(int matrix[][]) {
        System.out.println("THE matrix is :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix[][] = { { 2, 3, 7, },
                { 5, 6, 7 } };
        int row = 2, col = 3;

        PrintMatrix(matrix);
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        PrintMatrix(transpose);

    }
}
