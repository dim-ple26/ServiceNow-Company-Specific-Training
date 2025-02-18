package Trees;
import java.util.*;



class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class bst {

    static Node root=null;
    // dont use root as global data
    // it should be local

    public static Node insertNode(Node root,int data){
        if(root==null){
            Node newNode = new Node(data);
            root=newNode;
            return root;

        }
        else if(root.data>data){
            root.left=insertNode(root.left,data);

        }
        else if(root.data<data){
            root.right=insertNode(root.right, data);
        }
        return root;
    }

    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");

        }
    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }



    public static void main(String[] args) {
        root=insertNode(root,10);
        root=insertNode(root,8);
        root=insertNode(root,12);
        root=insertNode(root,14);
        root=insertNode(root,6);
        root=insertNode(root,9);
        // 10 8 6 9 12 14

        postorder(root);
        System.err.println();
        inorder(root);
        System.err.println();
        preorder(root);


        
    }
    
}
