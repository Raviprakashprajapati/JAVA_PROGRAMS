abstract class Human{

    void body(){ System.out.println("2 leg and 2 hand"); }
    abstract void gender();
    abstract void Hair();

}

class  Male extends Human{

    void gender(){
        System.out.println("Male classs");
    }
    void Hair(){
        System.out.println("short hair");
    }
}

class Female extends Human{

    void gender(){
        System.out.println("Female classs");
    }
    void Hair(){
        System.out.println("Long hair");
    }
}

public class abstract3 {
    public static void main(String[] args) {
        
        Male ravi = new Male();
        ravi.Hair();
        ravi.gender();
        ravi.body();

        Female priya  = new Female();
        priya.Hair();
        priya.gender();
        priya.body();

    }
    
}
