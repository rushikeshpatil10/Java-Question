
public class FriendsParingProblem {
    public static int friendsParing(int n) {
        // Base
        if (n == 1 || n == 2) {
            return n;
        }

        // Kaam
        // choice
        // single
        int fnm1 = friendsParing(n - 1);

        // pairs
        int fnm2 = friendsParing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // total ways
        int totalWays = fnm1 + pairWays;
        return totalWays;

    }

    public static void main(String[] args) {
        System.out.println(friendsParing(3));
    }
}
