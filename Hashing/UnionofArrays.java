package Hashing;

import java.util.HashSet;

public class UnionofArrays {

    public static int union(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int n1=arr1.length;
        int n2=arr2.length;


        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<n2;j++){
            set.add(arr2[j]);

        }

        return set.size();

    }



    public static void main(String[] args) {
        int arr1[]= {7,3,9};
        int arr2[]={6,3,9,2,9,4};
        System.out.println(union(arr1, arr2));
    }
    
}
