
import java.util.Stack;

public class stacl01 {
    public static void main(String[] args) {
        
        Stack <Integer>s1 = new Stack<>();
        s1.add(100);
        s1.add(200);
        s1.add(300);
        s1.add(400);
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.peek());
    }
    
}
