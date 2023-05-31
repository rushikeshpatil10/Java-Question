// package Recursion;

public class SumNnum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = sum(n - 1);
        int sn = n + Snm1;
        return sn;
    }
}
