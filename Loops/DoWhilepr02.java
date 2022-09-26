
// Display all number entered by user except multilple of 10 
import java.util.*;

public class DoWhilepr02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;

            }
            System.out.println("Number was :" + n);

        } while (true);
    }
}
