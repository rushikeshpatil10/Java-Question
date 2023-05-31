// Q find height of a tree
// Q find count of Nodes
// Q find sum of Nodes
public class HeightTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum + rightsum + root.data;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfDiam = rh + lh + 1;
        return Math.max(selfDiam, Math.max(rightDiam, leftDiam));
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Height of a tree: " + height(root));
        System.out.println("Count of Nodes: " + count(root));
        System.out.println("Sum of nodes :" + sum(root));
        System.out.println("Diameter of nodes :" + diameter(root));
    }
}
