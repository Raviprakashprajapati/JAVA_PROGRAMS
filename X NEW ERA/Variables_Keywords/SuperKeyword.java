
class Base extends Object{

    Base(){
        System.out.println("Base consturotrt");
    }
    Base(int n)
    {
        System.out.println("base 2mth");
    }
}

class Derive extends Base{
    Derive()
    {  
        //  this(5);
        System.out.println("derive constructor ...");
    }
    Derive(int n){
        // super(n);
        
        System.out.println("Derive 2 meth");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        
        Derive d = new Derive();

    }
    
}
