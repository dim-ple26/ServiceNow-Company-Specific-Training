package RecursionAndBacktracking;

public class binarySearch {

    public static boolean binarySearch(int arr[],int s,int e,int k){
        if(s>e){
            return false;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==k){
            return true;
        }
        if(arr[mid]<k){
            return binarySearch(arr, mid+1, e, k);

        }
        else{
            return binarySearch(arr,s,mid-1,k);
        }


    }

    public static void main(String[] args) {
        int[] arr={2,4,6,8,14,16,28};
        int size =arr.length;
        int key = 14;
        System.out.println(binarySearch(arr, 0, size-1, key));
    }
    
}
