// package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(fib(n));

    }

    public static int fib(int n) {
        // if (n == 0 || n == 1) {
        // return n;
        // }
        // return fib(n - 1) + fib(n - 2);

        if (n == 1 || n == 0) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;

    }
}
