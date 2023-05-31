
public class RevNumber {
    public static void main(String args[]) {
        int n = 10;
        revNum(n);
    }

    public static void revNum(int n) {
        if (n == 1) {
            System.out.println(" " + n);
            return;
        }

        System.out.print(" " + n);
        revNum(n - 1);

    }
}
