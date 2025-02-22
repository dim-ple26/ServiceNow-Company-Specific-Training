
package Hashing;
import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
       // Creating
        HashSet<Integer> set = new HashSet<>();


        // Insert
        set.add(1);
        set.add(2);
        System.out.println(set);

        // Search
        if(set.contains(1)){
            System.out.println("Set contains 1");

        }

        set.remove(1);
        set.size();

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
    
}
