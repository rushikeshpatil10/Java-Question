
// queue using Dequeue
import java.util.*;

public class Q2Deque {
    static class Queue {
        Deque<Integer> de = new LinkedList<>();

        public boolean isEmpty() {
            return de.isEmpty();
        }

        public void add(int data) {
            de.addLast(data);
        }

        public int remove() {
            return de.removeFirst();
        }

        public int peek() {
            return de.getFirst();
        }

    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
