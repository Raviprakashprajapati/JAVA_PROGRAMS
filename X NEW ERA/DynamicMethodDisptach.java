
class Base{
    void Base1(){
        System.out.println("Base1 meth...");
    }

    void BaseMeth(){
        System.out.println("Base 2 meth");
    }

}

class Derive extends Base{
    void derive1(){
        System.out.println("Derive 1    ");
    }


    void DeriveMeth(){
        System.out.println("Derive 2 meth");
    }

}


public class DynamicMethodDisptach {  
    public static void main(String[] args) {
    
        // Derive d = new Derive();
        // d.Base1();


        // we can create the refernce of the parent class and object of the  child class
        Base Bobj = new Derive();
        System.out.println(Bobj);
        // Bobj.Base1();
        // Bobj.derive1();
        Bobj.BaseMeth();
        Bobj.DeriveMeth(); //cannot caleed
s


        
    }
    
}
