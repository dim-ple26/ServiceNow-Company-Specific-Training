package Trees;
import java.util.*;



class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeSum {
    
    // Function to insert nodes in the binary tree level by level
    public static Node insertLevelOrder(int[] arr, Node root, int i, int n) {
        if (i < n) {
            Node temp = new Node(arr[i]);
            root = temp;

            // Insert left child
            root.left = insertLevelOrder(arr, root.left, 2 * i + 1, n);

            // Insert right child
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2, n);
        }
        return root;
    }

    // Function to print the level order traversal of the binary tree
    public static void printLevelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        System.out.println();
    }

    // Function to check if the binary tree is a sum tree
    public static boolean isSumTree(Node root) {
        if (root == null)
            return true;

        if (root.left == null && root.right == null)
            return true;

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        if (root.data == leftSum + rightSum && isSumTree(root.left) && isSumTree(root.right))
            return true;

        return false;
    }

    // Function to calculate the sum of the nodes of a tree
    public static int sum(Node root) {
        if (root == null)
            return 0;

        return root.data + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input reading
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Build the binary tree
        Node root = insertLevelOrder(arr, null, 0, n);
        
        // Print level order traversal
        System.out.print("Level order traversal: ");
        printLevelOrder(root);
        
        // Check if the tree is a sum tree
        if (isSumTree(root)) {
            System.out.println("Binary tree is a sum tree");
        } else {
            System.out.println("Binary tree is not a sum tree");
        }
    }
}
