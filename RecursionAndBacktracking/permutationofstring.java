package RecursionAndBacktracking;
import java.util.*;
public class permutationofstring {
    static void perm(String str,String ans){
        if(str.length()==0){
            System.out.println(ans+" ");
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String rest = str.substring(0,i)+str.substring(i+1);
            perm(rest,ans+ch);
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        perm(s,"");
    }
}
