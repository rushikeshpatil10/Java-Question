import java.util.*;

public class Basic01 {
    public static void main(String args[]){
        HashMap<String, Integer> hs = new HashMap<>();

        hs.put("Tea", 20);
        hs.put("Samosa", 15);
        hs.put("Pizza", 250);
        hs.put("burger", 80);
        hs.put("coffee", 80);
        

        // System.out.println(hs);
        // int tea = hs.get("Tea");
        // System.out.println(tea);

        // System.out.println(hs.containsKey("Tea"));
        // hs.remove("coffee");
        // System.out.print(hs);

        Set<String> keys = hs.keySet();
        // System.out.println(keys);
        System.out.println(hs.get("Tea"+1));

        // for (String k : keys) {
        //     System.out.println("keys = "+ k + "values = " +hs.get(k)  );
        // }

    }
}
