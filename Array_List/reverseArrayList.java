// Q. Reverse the order of ArrayList

import java.util.ArrayList;

public class reverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); // o(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        // reveres print
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
