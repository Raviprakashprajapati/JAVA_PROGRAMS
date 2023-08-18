
class Template1{
    public String a = "public access";
}

class Template2{
    private String b = "private access";
}
class Template3{
    protected String c = "protected access";

    void print(){
        System.out.println("template 3 acess template1 public");
    }

}

public class Ravi {
    public static void main(String[] args) {

        Template1  obj1 = new Template1();
        System.out.println(obj1.a);

          Template3 obj3 = new Template3();
        System.out.println(obj3.c);
        obj3.print();

        // Template2 obj2 = new Template2();
        // System.out.println(obj2.b);
    }
}
