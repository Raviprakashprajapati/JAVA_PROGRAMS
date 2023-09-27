
import java.util.*;
public class HashSet01 {
    public static void main(String[] args) {
        
        int arr[] = {100,4,200,1,3,2,200};
        HashSet<Integer> hh = new HashSet<>();

        for (Integer i : arr) {
            hh.add(i);
        }
        
        System.out.println(hh);
        int startingPoint = 0;
        for (Integer i : hh) {
            if(!hh.contains(i-1)){
                // startingPoint = i;
                if(startingPoint>i)
                {
                    startingPoint = i;
                    
                }
            }
        }
        System.out.println(startingPoint);

       
    }
    
}
