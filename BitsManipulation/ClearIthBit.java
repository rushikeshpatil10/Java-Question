package BitsManipulation;

public class ClearIthBit {
    public static int clearIthBit(int n, int i) {
        int bitMAsk = ~(1 << i);
        return n & bitMAsk;
    }

    public static void main(String args[]) {
        System.out.println(clearIthBit(10, 1));
    }
}
