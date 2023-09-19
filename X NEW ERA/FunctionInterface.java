interface Base{
    int show(int n);
}

public class FunctionInterface {
    public static void main(String[] args) {
        
        Base b =(int n)->{
            System.out.println("show function "+n);
            return n;
           
        };
 System.out.println(b.show(565));
    }
    
}
