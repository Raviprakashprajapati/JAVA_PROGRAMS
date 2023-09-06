interface BaseInterface{
    void base1();
    void base2();
}

interface DeriveInterface extends BaseInterface{
    void derive1();
}

class MyClass implements DeriveInterface{
    void MyclassFunction(){
        System.out.println("myclasss function");
    }
   public void base1(){
        System.out.println("Base 1");
    }
    public void base2(){
        System.out.println("Base 2");
    }
    public void derive1()
    {
        System.out.println("Dervie 1");
    }
}

public class inter_with_inherit {
    public static void main(String[] args) {

        // MyClass a = new MyClass();
        // a.base1();
        // a.base2();
        // a.derive1();


        // DeriveInterface a = new MyClass();
        // a.base1();
        // a.derive1();
        // a.MyclassFunction(); //it not possible



    }

}
