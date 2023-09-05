import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
public class ArrayList1 {

    static void reverse(ArrayList<Integer> list)
    {
        int left = 0;
        int right = list.size()-1;
        while (left < right){
            Integer temp = Integer.valueOf(list.get(left));
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // list.set(0, 420);
        // System.out.println(list);
        // System.out.println(list.lastIndexOf(Integer.valueOf(30)));
        list.add(50);
        list.add(50);
        // System.out.println(list);
        list.remove(Integer.valueOf(50));
        // System.out.println(list);

        // reverse(list);
        list.add(10);
        // System.out.println(list);
        Collections.sort(list);
        // System.out.println(list);

        ArrayList<String> l = new ArrayList<>();
        l.add("ravi");
        l.add("saurav");
        l.add("avinash");
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);


    

        


    }
    
}
