package Trees;
// https://www.onlinegdb.com/ftuj3edvo

import java.util.Scanner;

class Node {
    int data;
    int height;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.height = 1;
    }
}

class AVLTree {
    private Node root;

    private int getHeight(Node root) {
        return (root == null) ? 0 : root.height;
    }

        private int getBalanceFactor(Node root) {
        return (root == null) ? 0 : getHeight(root.left) - getHeight(root.right);
    }

    private void updateHeight(Node root) {
        if (root != null) {
            root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }

    private Node rotateRight(Node root) {
        Node temp = root.left;
        Node T2 = temp.right;
        temp.right = root;
        root.left = T2;
        updateHeight(root);
        updateHeight(temp);
        return temp;
    }

    private Node rotateLeft(Node root) {
        Node temp = root.right;
        Node T2 = temp.left;
        temp.left = root;
        root.right = T2;
        updateHeight(root);
        updateHeight(temp);
        return temp;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        } else {
            return root;
        }
        updateHeight(root);
        return balance(root);
    }

    private Node balance(Node root) {
        int balanceFactor = getBalanceFactor(root);
        if (balanceFactor > 1) {
            if (getBalanceFactor(root.left) < 0) {
                root.left = rotateLeft(root.left);
            }
            return rotateRight(root);
        }
        if (balanceFactor < -1) {
            if (getBalanceFactor(root.right) > 0) {
                root.right = rotateRight(root.right);
            }
            return rotateLeft(root);
        }
        return root;
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    private Node delete(Node root, int data) {
        if (root == null) return null;
        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null || root.right == null) {
                return (root.left != null) ? root.left : root.right;
            }
            Node temp = findMinNode(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        updateHeight(root);
        return balance(root);
    }

    private Node findMinNode(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AVLTree tree = new AVLTree();

        while (true) {
            int data = in.nextInt();
            if (data == -1) break;
            tree.insert(data);
        }

        int deleteKey = in.nextInt();
        tree.delete(deleteKey);
        tree.inOrderTraversal();

    }
}