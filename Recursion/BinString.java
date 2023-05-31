
public class BinString {
    public static void printBinString(int n, int lastPalce, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Kaam
        printBinString(n - 1, 0, str + "0");
        if (lastPalce == 0) {
            printBinString(n - 1, 1, str + "1");
        }

    }

    public static void main(String args[]) {
        printBinString(3, 0, "");
    }
}
