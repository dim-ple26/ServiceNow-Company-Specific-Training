package RecursionAndBacktracking;

public class CheckPalindrome {

    public static boolean check(StringBuilder str,int i,int j){
        if(i>j){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }else{
            return check(str, i+1, j-1);
        }
    }

    public static void main(String[] args) {
        String name ="maddam";
        StringBuilder str = new StringBuilder(name);
        boolean ispal = check(str,0,str.length()-1);
        System.out.println(ispal);
    }
    
}
