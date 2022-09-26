
// Write a program that read a set of integer and then print the sum of the even and odd iteger
import java.util.*;

public class LoopQ1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;
        do {
            System.out.print("Enter the number ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }

            System.out.print("Do you want to continue? Press 1 for yes or Press 0 for no");

            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even Number is " + evensum);
        System.out.println("Sum of odd Number is " + oddsum);
    }
}
