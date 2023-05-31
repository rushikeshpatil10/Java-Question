// package Arrays;

public class kadanes {
    public static void Kadanes(int number[]) {
        int ms = Integer.MIN_VALUE; // ms = Maximum Subarray Number
        int cs = 0; // cs = Current Subarray Number

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            ms = Math.max(cs, ms);
            if (cs < 0) {
                cs = 0;
            }

        }
        System.out.println("Our Max subarray sum is : " + ms);

    }

    public static void main(String args[]) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        Kadanes(number);
    }
}
