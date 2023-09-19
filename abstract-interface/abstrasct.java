
abstract class Base{
    
    // Base(){ System.out.println("Base constructor"); }
    void baseGreet(){ System.out.println("BAse greet funciton"); }
    abstract void greet();
    abstract void greet2();
}

class Derive extends Base{

    void greet(){ System.out.println("good morning derive class"); }
    void greet2(){ System.out.println("good morning 2 derive class"); }
}

// abstract class Derive2 extends Base{
    
//     void greet(){ System.out.println("good morning derive2 class"); }
//     // void greet2(){ System.out.println("good morning 2 derive2 class"); }

// }


public class abstrasct {
    public static void main(String[] args) {
        
        // Base b = new Derive();
        // b.baseGreet();
        // b.greet();
        // Derive d = new Derive();
        // Derive2 d2 = new Derive2();


        Base b = new Derive();
        b.greet2();
    }
}
