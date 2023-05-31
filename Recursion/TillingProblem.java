
public class TillingProblem {
    public static void main(String args[]) {
        System.out.println(tillingProblem(4));
    }

    public static int tillingProblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // kamm
        // vertical choice
        int fnm1 = tillingProblem(n - 1);

        // horizontal choice
        int fnm2 = tillingProblem(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
}
