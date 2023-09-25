package practive01;
interface Base{
    int a = 9;
    void meth1();
    void meth2();
    // void display(){
    //     System.out.println("non abstract method not valid");
    // }

}


class Derive implements Base{
   public void meth1(){
        System.out.println("Meth1 called");
    }
   public void meth2(){
        System.out.println("Meth2 called");
    }
}

public class Interface00 {
public static void main(String[] args) {
    
    Derive d = new Derive();
    d.meth1();
    
    // System.out.println(Base.a);

}    
}
