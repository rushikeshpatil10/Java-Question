import java.util.*;

public class LoopQ2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int num;
        System.out.print("Enter any positive integer");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial is: " + fact);
    }
}