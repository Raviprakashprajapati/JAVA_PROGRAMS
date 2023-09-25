import java.util.PriorityQueue;
import java.util.Queue;

public class quene01 {
public static void main(String[] args) {
    
    Queue <Integer> q = new PriorityQueue<>();
    q.add(100);
    q.add(200);
    q.add(300);
    System.out.println(q);
    System.out.println(q.remove());
    System.out.println(q);

}    
}
