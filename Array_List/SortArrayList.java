import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2); // o(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list); // Assending sort
        System.out.println(list);

        // Decending sort
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
