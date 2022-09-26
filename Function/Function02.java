import java.util.*;

public class Function02 {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // public static void main(String args[]) {

    // System.out.println(fact(4));
    // }

    public static int binCoefficent(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n - r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(binCoefficent(a, b));
    }
}

/**
 * @param args
 */
