
class Base{
    Base()
    {
        System.out.println("base conturtcor called....");
    }
    void show(){
        System.out.println("Show meth Called...");
    }
}

public class AnounmouesObject {
    
    public static void main(String[] args) {

        // Base b = new Base(); //it store the referce of creeting object
        // new Base(); //it create object
        
       new Base().show();
    }
}
