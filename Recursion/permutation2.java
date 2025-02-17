package Recursion;

public class permutation2 {

    public static void swapping(char str[],int i,int j){
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;

    }

    public static void permutation(char str[], int start){

        if(start==str.length){
            System.out.print(new String(str)+" ");
            return;
        }

        for(int i=start;i<str.length;i++){
            swapping(str,start,i);
            permutation(str, start+1);
            swapping(str,start,i);

        }

    }

    public static void main(String[] args) {
        String str ="ABC";
        permutation(str.toCharArray(),0);
    }
    
}
