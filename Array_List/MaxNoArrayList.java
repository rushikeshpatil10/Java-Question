
// Q. Find max value from ArrayList
import java.util.ArrayList;

public class MaxNoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2); // o(1)
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (max < list.get(i))
            // max = list.get(i);
            max = Math.max(max, list.get(i));

        }
        System.out.println("Max element = " + max);

    }
}
