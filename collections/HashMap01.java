import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;


// Hashmap vs Hashtable 
// HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
// HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
// HashMap is generally preferred over HashTable if thread synchronization is not needed.

public class HashMap01 {
    public static void main(String[] args) {

        // searching,insertion,del,container O(1)
        // hashmap - unordered
        // HashMap<Integer,String> hh = new HashMap<>();
        // LinkedHashMap<Integer,String> ll = new LinkedHashMap<>();
        // SortedMap<Integer,String> ss = new SortedMap<>();
        // Hashtable<>

        // HashMap <Integer,String> h = new HashMap<>();
        // // System.out.println(h.size());
        // h.put(1, "ravi");
        // h.put(2, "ravi2");
        // h.put(3, "ravi3");
        // System.out.println(h.entrySet());
        // System.out.println(h);
        // System.out.println(h.keySet());


        // find the freq count----
        int arr[] = {1,3,3,2,1,3,3};
        HashMap <Integer,Integer> h = new HashMap<>();
        
        for (int i : arr) {
            if(h.containsKey(i))
            {
                int count = h.get(i);
                count++;
                h.put(i,count );
            }
            else{
                h.put(i, 1);
            }
        }
        
        int fre = 0;
        int value =0 ;
        for(var m : h.entrySet())
        {
            if(fre<m.getValue())
            {
                fre = m.getValue();
                value = m.getKey();
            }
        }

        System.out.println(value+"   "+fre);
        


        
    }

}
