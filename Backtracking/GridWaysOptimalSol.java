
public class GridWaysOptimalSol {
    // package Recursion;

    public static void main(String args[]) {
        int n = 3;
        int m = 3;
        System.out.println((fact(n - 1 + m - 1)) / (fact(n - 1) * fact(m - 1)));

    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

}
