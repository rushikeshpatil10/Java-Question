import java.util.*;

public class Exapmple {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float Total = pencil + pen + eraser;
        System.out.println("Total of Bill is:" + Total);

        // Add 18% GST to the Bill
        float newTotal = Total + (0.18f * Total);
        System.out.println("Bill with 18% TAX:" + newTotal);

    }
}