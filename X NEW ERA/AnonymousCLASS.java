class Base{
    // Base(){
    //     System.out.println("Base constructor");
    // }
    void show(){
        System.out.println("Show callled");
    }

}

public class AnonymousCLASS {
    public static void main(String[] args) {
        
        Base b = new Base(){
         
            void show(){
                System.out.println("updated show ");
            }
        };
        b.show();

    }
    
}
