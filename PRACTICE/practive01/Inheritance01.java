
class Base{
    int i = 10;
     void show(){
        System.out.println("Base show called...");
     }
}

class Derive extends Base{
    int i = 20;
     @Override
    void show(){
        System.out.println("Derive show called... = "+ i );
    }

    void derive1(){
        System.out.println("derive1 methos..");
    }

}


public class Inheritance01 {
    
    public static void main(String[] args) {
        
    //  Base b = new Derive();
    //     b.show();
    //     b.derive1();
    //     System.out.println(b.i);

    int arr[] = {2,3,896,214,9,39,69,1};
    int min = Integer.MAX_VALUE;
    for(int i = 0;i<arr.length;i++){
        if(arr[i]<min){
                min = arr[i];
        }
    }

    System.out.println(min);

    }
    
}
