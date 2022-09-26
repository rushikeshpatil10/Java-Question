package Arrays2D;

// Print out the sum of the numbers inthe second row of the “nums” array.Example :
// Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} }
public class Q2_2DArray {
    public static void SumArray(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[2][i];
        }
        System.out.println("Sum is : " + sum);
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        SumArray(matrix);
    }
}
