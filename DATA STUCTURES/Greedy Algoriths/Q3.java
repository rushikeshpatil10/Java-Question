
import java.util.*;

// Min Absolute pair diff 
public class Q3 {
    public static void main(String args[]) {
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for (int i = 0; i < B.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.print("min absolute Diff of pair = " + minDiff);
    }
}
