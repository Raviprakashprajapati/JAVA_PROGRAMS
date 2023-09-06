abstract class Phone{
    int a = 1;
     void time(){
        System.out.println("Current time is " + System.currentTimeMillis());
    }
    abstract void playStore();
}

class SmartPhone extends Phone{
    
     void playStore(){
        System.out.println("there are 5 aps in play store");
    }
}


public class abstract2 {
    public static void main(String[] args) {

        SmartPhone redmi = new SmartPhone();
        redmi.playStore();
        redmi.time();
        System.out.println(redmi.a);
    }
}
