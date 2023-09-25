package practive01;

class Base{
  
     void show(){
        System.out.println("Base show called...");
     }
}

class Derive extends Base{

     @Override
    void show(){
        System.out.println("Derive show called...");
    }

     Derive(){ 
        System.out.println("Derive construtcor");
    }

   
}

class GrandChild extends Derive{
    GrandChild(){ System.out.println("grandChild constructor"); }
    GrandChild(int g){ System.out.println("grandChild value of g");}
 
}

public class Inheritance01 {
    
    public static void main(String[] args) {
        
        Derive b = new Derive();
        b.show();


    }
    
}
