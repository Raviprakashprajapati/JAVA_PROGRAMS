
import java.util.ArrayDeque;

public class ArrayQuene {

    public static void main(String[] args) {
        
        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        d1.add(10);
        d1.add(20);
        d1.add(30);
        d1.add(40);

        System.out.println(d1.getLast());
        System.out.println(d1.getFirst());


    }
    
}
