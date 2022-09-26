import java.util.*;

public class Function03 {
    public static int multiply(int a, int b) {

        int Product = a * b;

        return Product;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int mult = multiply(x, y);
        System.out.println(x + " * " + y + "=" + mult);
    }
}
