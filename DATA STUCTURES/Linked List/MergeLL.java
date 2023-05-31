
public class MergeLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step 1 =create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 -> NewNode next = head
        newNode.next = head; // link

        // step 3 -> head - NewNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow; // mid node
    }

    private Node merge(Node Head1, Node Head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (Head1 != null && Head2 != null) {
            if (Head1.data <= Head2.data) {
                temp.next = Head1;
                Head1 = Head1.next;
                temp = temp.next;
            } else {
                temp.next = Head2;
                Head2 = Head2.next;
                temp = temp.next;
            }
        }
        while (Head1 != null) {
            temp.next = Head1;
            Head1 = Head1.next;
            temp = temp.next;

        }
        while (Head2 != null) {
            temp.next = Head2;
            Head2 = Head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public Node MergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find Mid
        Node mid = getMid(head);
        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(rightHead);
        // merge
        return merge(newLeft, newRight);
    }

    public static void main(String args[]) {

        MergeLL ll = new MergeLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head = ll.MergeSort(head);
        ll.print();

    }
}
