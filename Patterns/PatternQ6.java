public class PatternQ6 {
    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted_rotated_half_pyramid(4);
    }
}

// import java.util.Scanner;

// public class PatternQ6 {

// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// int n = 0;

// // take input
// System.out.print("Enter number of rows:: ");
// n = scan.nextInt();

// // loop
// for (int i = 1; i <= n; i++) {
// // space
// for (int j = 1; j <= n - i; j++)
// System.out.print(" ");

// // star
// for (int k = 1; k <= i; k++)
// System.out.print("*");

// // new line
// System.out.println();
// }
// }
// }