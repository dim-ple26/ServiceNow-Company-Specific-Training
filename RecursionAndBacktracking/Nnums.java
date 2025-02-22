package RecursionAndBacktracking;
import java.util.*;
public class Nnums {

    static void num(int n){
        if(n==0){
            return;
        }
        num(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        num(n);
    }


    
}
