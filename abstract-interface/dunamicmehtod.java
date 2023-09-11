class Base{

    void base1(){
        System.out.println("base 1 called");
    }
    void base2(){
        System.out.println("base 2 called");
    }
}

class Derive extends Base{
    void derive1(){
        System.out.println("derive1 called");
    }
    void base2(){
        System.out.println("BAse 2 convert into Derive2");
    }
    
}


public class dunamicmehtod {
    public static void main(String[] args) {

        Base b = new Derive();
        // b.base1();
        // b.base2();   // it called dervice wala base2
        // b.derive1();  //not posible
        
        Derive d = new Base();  //child->parent not posible hai bhai
        // d.base1();
        // d.base2();
        // d.derive1();

        
    }
    
}
