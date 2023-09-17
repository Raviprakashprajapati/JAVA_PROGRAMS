
public class FinalKeyword {

    static final void show(){
        System.out.println("final show meth");
    }
   static  void show(int a,int b)
    {
        System.out.println("a and b");
    }
    public static void main(String[] args) {
        
        final int age = 10;
        // age =70; //error

        show();
        show(3,4);




    }
}
