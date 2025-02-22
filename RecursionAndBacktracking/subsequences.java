package RecursionAndBacktracking;
import java.util.*;
public class subsequences {
    


    private void solve(String str, String output, int index, List<String> ans) {
        // Base case
        if (index >= str.length()) {
            ans.add(output);
            return;
        }
        
        // Exclude
        solve(str, output, index + 1, ans);
        
        // Include
        solve(str, output + str.charAt(index), index + 1, ans);
    }
    
    public List<String> subsequences(String str) {
        List<String> ans = new ArrayList<>();
        solve(str, "", 0, ans);
        return ans;
    }
    
    public static void main(String[] args) {
       // Solution sol = new Solution();
        String str = "abc";
       // List<String> result = sol.subsequences(str);
        //System.out.println(result);
    }


    
}
