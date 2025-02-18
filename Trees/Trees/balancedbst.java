package Trees;

class tNode{
    int data;
    tNode left;
    tNode right;
    tNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class balancedbst {

    //static Node root=null;
    // dont use root as global data
    // it should be local

    public static tNode insertNode(tNode root,int data){
        if(root==null){
            
            return new tNode(data);

        }
        else if(root.data>data){
            root.left=insertNode(root.left,data);

        }
        else if(root.data<data){
            root.right=insertNode(root.right, data);
        }
        return root;
    }

    public static void preorder(tNode root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static tNode merge(int[] arr,int start,int end){
        if(start>end){
            return null;
        }
            int mid = (start+end)/2;
            tNode root = new tNode(arr[mid]);
            
            root.left=merge(arr, start, mid-1);
            root.right=merge(arr, mid+1,end);
        
        return root;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
       // Node root=null;
        tNode root =merge(arr, 0,arr.length-1);
        preorder(root);

        
    }
    
}
