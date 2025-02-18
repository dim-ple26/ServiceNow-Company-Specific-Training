package Trees;
import java.util.*;

public class BinaryTreeSum {
    static int size=0;
private static class Node{
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value=value;
    }
}

public static void  preorder(Node root){
    if(root==null) return;
    size++;
    //System.out.println(root.value+" ");
    preorder(root.left);
    preorder(root.right);
}

public static int size(Node root){
    if(root==null) return 0;
    return 1+size(root.left)+size(root.right);
}

public static int sum(Node root){
    if(root==null) return 0;

    return root.value + sum(root.left)+sum(root.right);

}

public static int height(Node root){
    if(root==null) return 0;
     return 1+Math.max(height(root.left), height(root.right));
}

public static void nthlevel(Node root,int n){
    if(root==null) return;
    if(n==1) System.out.print(root.value+" ");
    nthlevel(root.left, n-1);
    nthlevel(root.right, n-1);
    
}

public static void bfs(Node root){
    Queue<Node> q = new LinkedList<>();
     if(root!=null) q.add(root);
    while(q.size()>0){
        Node temp=q.peek();
        if(temp.left!=null) q.add(temp.left);
        if(temp.left!=null) q.add(temp.left);
        System.out.println(temp.value +" ");
        q.remove();

    }
}

public static void main(String[] args) {
    Node root = new Node(2);
    Node a = new Node(4);
    Node b = new Node(10);
root.left=a;
root.right=b;
    
    Node c = new Node(6);
    Node d = new Node(5);
    a.left=c;
    a.right=d;
    Node e = new Node(11);
b.right=e;

//preorder(root);
System.out.println(size(root));
System.out.println(sum(root));
System.out.println(height(root));

int level = height(root)+1;
for(int i=1;i<=level;i++){
    nthlevel(root, i);
}

    
}


}