
public class Power {
    public static void main(String args[]) {
        System.out.println(optimisedPower(3, 5));
        // System.out.println(pow(3, 5));
    }

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * pow(x, n - 1);
    }

    // Optimized Solution
    public static double optimisedPower(double a, int n) {
        if (n == 0) {
            return 1;
        }
        double halpPower = optimisedPower(a, n / 2);
        double halpPowerSq = halpPower * halpPower;

        // n is odd
        if (n % 2 != 0) {
            halpPowerSq = a * halpPowerSq;
        }

        return halpPowerSq;

    }

}
