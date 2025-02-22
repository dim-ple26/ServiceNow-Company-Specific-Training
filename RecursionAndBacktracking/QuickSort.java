package RecursionAndBacktracking;

public class QuickSort {
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static int partition(int arr[],int s , int e){
        int pivot=arr[s];
        int cnt=0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot){
                cnt++;
            }
        }
        int pi=s+cnt;
        swap(arr,pi,s);


        int i=s;
        int j=e;
        while(i<pi && j>pi){

            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pi && j>pi){
                swap(arr,i++,j--);
            }
            
        }
        return pi;

    }

    public static void quicksort(int arr[],int s ,int e){
        if(s>=e){
            return;
        }
        int pivot = partition(arr,s,e);
        quicksort(arr, s, pivot-1);
        quicksort(arr, pivot+1, e);
    }


    public static void main(String[] args) {
        int arr[]={2,4,1,3,9};
        int n =arr.length;
        quicksort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
