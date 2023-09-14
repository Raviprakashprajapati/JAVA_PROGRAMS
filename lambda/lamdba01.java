@FunctionalInterface
interface Demo {
    void meth1();
    
}

public class lamdba01 {
    public static void main(String[] args) {
        
        Demo d1 = ()->{
            System.out.println("hello");
        };
        d1.meth1();
    }
    
}
