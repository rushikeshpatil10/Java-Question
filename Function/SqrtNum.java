public class SqrtNum {
    public static int floorsqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int i = 1, result = 1;
        while (result <= x) {
            i++;
            result = i * i;

        }
        return i - 1;
    }

    public static void main(String args[]) {
        // int x = 4;
        // System.out.println(floorsqrt(x));
        int a = 0;
        int n = 2;
        for (int i = 0; i < n; ++i) {
            for (int j = n; j > i; --j) {
                a = a + i + j;
            }
        }
        System.out.println(a);
    }
}
