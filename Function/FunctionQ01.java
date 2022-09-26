
// Avarage of three number using function
import java.util.*;

public class FunctionQ01 {
    public static int Avg3Num(int a, int b, int c) {
        int Avg = (a + b + c) / 3;
        return Avg;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Average = Avg3Num(a, b, c);
        System.out.println(Average);

    }
}
