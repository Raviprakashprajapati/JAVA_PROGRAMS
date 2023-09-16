interface Demo {
    void meth1();
    void meth2();
}

public class anomaous02 {
    public static void main(String[] args) {
        
        Demo d1 = new Demo() {
            public void meth1(){
                System.out.println("Meth1");
            }
            public void meth2(){
                System.out.println("meth2");
            }
        };
        d1.meth1();

        

    }
    
}
