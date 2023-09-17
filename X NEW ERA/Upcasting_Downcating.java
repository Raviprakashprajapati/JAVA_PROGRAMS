class Base{
    void meth1(){
        System.out.println("Base meth");
    }
}

class Derive extends Base{
    void meth1(){
        System.out.println("Derive meth");
    }
}

public class Upcasting_Downcating {
    public static void main(String[] args) {


        //upcasting is a typecasting of child object to the parent object
        Base b =(Base)  new Derive();
        // b.meth1();
        b.meth1();

        //downcasting is a typecasting of parent object to the child object
    }
    
}
