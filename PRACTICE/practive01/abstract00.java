import Laptop;

package practive01;
abstract class Computer  {
   
    void booting(){
        System.out.println("System starting...");
    }
    abstract void meth1();
    abstract void meth2();
}




class Laptop extends Computer{
    
   public  void meth1(){
        System.out.println("Laptop meht1 ");
    }
   public  void meth2(){
        System.out.println("Laptop meht2");
    }
    
   public  void op(){
        System.out.println("Operating system op");
    }
   public  void op1(){
        System.out.println("Operating system op1");
    }
}

public class abstract00 {
    public static void main(String[] args) {
        
        Laptop asus = new Laptop();
        asus.booting();
        asus.meth1();
     
    }
    
}
