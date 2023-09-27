import java.util.HashMap;
import java.util.Hashtable;

public class HAshTable01 {
    public static void main(String[] args) {
        
        Hashtable<Integer,Integer> hh = new Hashtable<>();
        hh.put(1, 100);
        hh.put(2, 200);
        hh.put(3, 300);
        // hh.put(null, 400);
        System.out.println(hh);
        System.out.println(hh.entrySet());

        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(10, 20);
        hm.put(null, null);
        System.out.println(hm);

    }
    
}
