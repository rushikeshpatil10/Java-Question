import java.util.*;

public class DequeJCF {
    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.addFirst(0);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);

        System.out.println("First Element is " + deque.removeFirst());
        System.out.println("Last Element is " + deque.removeLast());

    }
}
