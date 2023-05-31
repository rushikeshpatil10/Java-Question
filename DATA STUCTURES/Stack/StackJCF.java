import java.util.*;

public class StackJCF {
    public static void main(String args[]) throws Exception {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            // s.pop();
        }
        // // s.pop();
        // System.out.println(s.peek());
    }
}
