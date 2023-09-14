import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList01 {
    public static void main(String[] args) {
        
        ArrayList<Integer> l1 = new ArrayList<>(10);
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("ravi");
        l2.add("saurav");
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(30);
        l1.add(30);
        l1.add(30);
        l1.add(30);
        l1.add(30);
        l1.add(30);
        l1.add(30);
        l1.add(30);
        l1.add(30);
        l1.add(30);
        l1.add(30);
        l1.add(30);
        // l1.addAll(l2);
        for(int i = 0; i < l1.size(); i++)
        {
            System.out.print(l1.get(i)+ "  ");
        }

    }
    
}

