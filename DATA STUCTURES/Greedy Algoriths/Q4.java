import java.util.Arrays;
import java.util.Comparator;

// Q Max lenght chain of pairs

public class Q4 {
    public static void main(String agrs[]) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 38 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chainLen = 1;
        int chainEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];

            }
        }
        System.out.print("max Length of chain = " + chainLen);
    }
}
