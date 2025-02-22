package RecursionAndBacktracking;

public class ReverseString {

    public static void reverse(StringBuilder str,int i ,int j){
        if(i>j){
            return;
        }
        char temp=str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);

        
        // i++;
        // j--;
        reverse(str, i+1, j-1);

    }



    public static void main(String[] args) {

        String name="babbar";
        StringBuilder str = new StringBuilder(name);
        reverse(str, 0,str.length()-1);
        System.out.println(str);
    }
    
}
