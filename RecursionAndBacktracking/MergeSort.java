package RecursionAndBacktracking;

public class MergeSort {

    public static void merge(int arr[],int s,int e){
        int mid =(s+e)/2;
        int len1 =mid-s+1;
        int len2 = e-mid;
        int arr1[]= new int[len1];
        int arr2[]= new int[len2];
        int k=s;
        for(int i=0;i<len1;i++){
            arr1[i]=arr[k++];
        }

        k=mid+1;
        for(int i=0;i<len2;i++){
            arr2[i]=arr[k++];
        }

        int i1=0;
        int i2=0;
        k=s;

        while(i1<len1 && i2<len2){
            if(arr1[i1]<arr2[i2]){
                arr[k++]=arr1[i1++];
            }
            else{
                arr[k++]=arr2[i2++];
            }
        }
        while(i1<len1){
            arr[k++]=arr1[i1++];
        }
        while(i2<len2){
            arr[k++]=arr2[i2++];
        }


    }



    public static void mergeSort(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int mid =(s+e)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merge(arr,s,e);
    }

    public static void main(String[] args) {
        int arr[] ={2,5,1,6,9};
        int n =arr.length;
        mergeSort(arr,0,n-1);

    }
    
}
