package Hashing;

import java.util.HashSet;

public class IntersectionofArrays {

    public static int intersection(int arr1[],int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int count=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }

        for(int j=0;j<n2;j++){
            if(set.contains(arr2[j])){
                count++;
            }
        }


        return count;
    }

    public static void main(String[] args) {
        int arr1[]={7,3,9,2};
        int arr2[]={5,9,3,2,1};
        System.out.println(intersection(arr1, arr2));
    }
    
}
