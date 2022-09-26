// package BitsManipulation;

public class OddEven {
    public static void oddOrEven(int n) {
        int BitMask = 1;
        if ((n & BitMask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String args[]) {
        oddOrEven(3);
        oddOrEven(4);
    }
}
