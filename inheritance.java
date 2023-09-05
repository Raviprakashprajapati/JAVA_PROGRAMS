
class Base{
    int x;

     Base(){ System.out.println("Base construtcor");  }
     Base(int x){ System.out.println( "Base constructor woth value of a" );}
}

class Derive extends Base{
     Derive(){ 
        // super(90);
        System.out.println("Derive construtcor");
    }
}

class GrandChild extends Derive{
    GrandChild(){ System.out.println("grandChild constructor"); }
    GrandChild(int g){ System.out.println("grandChild value of g");}
    void display(){ System.out.println("x is  " + x);  }

    
}

public class inheritance {
    public static void main(String[] args) {

        GrandChild g = new GrandChild(90);
        g.x = 90;
        g.display();

        

    }
    
}
