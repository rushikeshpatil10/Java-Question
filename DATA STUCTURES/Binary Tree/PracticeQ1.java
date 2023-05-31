// identify the given binary tree is univalued or not print yes if it is univalued 

public class PracticeQ1 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isUnivalued(Node root) {
        if (root != null) {
            if (root.left != null && root.left.data != root.data) {
                return false;
            }
            if (root.right != null && root.right.data != root.data) {
                return false;
            }
            return isUnivalued(root.left) && isUnivalued(root.right);

        }
        return true;
    }

    public static void main(String args[]) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        if (isUnivalued(root)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(isUnivalued(root));

    }
}
