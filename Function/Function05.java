public class Function05 {

    // public static boolean isPrime(int n) {
    // // boolean isPrime = true;
    // if (n == 2) {
    // return true;
    // }
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // return false;

    // }
    // }
    // return true;
    // }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void primesRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // System.out.println(isPrime(16));
        primesRange(20);
    }
}
