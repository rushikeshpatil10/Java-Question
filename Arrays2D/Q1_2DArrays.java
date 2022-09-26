package Arrays2D;

// Print the number of 7’s that are inthe 2d array.Example :Input - 
// int[][] array = { {4,7,8},{8,8,7} };
public class Q1_2DArrays {
    public static void Print7(int array[][]) {
        int countof7 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 7) {
                    countof7++;
                }
            }
        }
        System.out.println("count of 7 is :" + countof7);
    }

    public static void main(String args[]) {
        int array[][] = { { 4, 7, 8 }, { 8, 8, 7, }, { 7, 5, 7 } };
        Print7(array);
    }
}
