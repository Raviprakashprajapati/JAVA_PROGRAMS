import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionAPI {
    public static void main(String[] args) {

        // collection API - concept
        // colllection - interface
        // colllections - classs

        // map-------
        // Map<Integer,String> obj = new HashMap<>();
        // obj.put(1,"ravi");
        // obj.put(2,"saurav");
        // obj.put(3,"avinash");
        // System.out.println(obj);
        // System.out.println(obj.size());
        // System.out.println(obj.remove(1));
        // System.out.println(obj);


        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(10);
        obj.add(6);
        obj.add(3);
        obj.add(200);
        System.out.println(obj);
        Collections.sort(obj);
        System.out.println(obj);
        

        
    }
    
}
