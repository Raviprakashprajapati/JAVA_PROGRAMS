interface Camera{
    void takePick();
    void recordVideo();
    private void func(){
        System.out.println("it never call by any other class except his class ");
    }
    default void takeSnap(){
            func();
        System.out.println("Taking snap done");
    }
  
}

interface Wifi{
    void wifiConnect();
    void allNetwork();
}


class MyCellPhone{
    void callNumber(){
        System.out.println("Calling On");
    } 
    void pickCall(){
        System.out.println("Pick Call");
    }
}


class MySmartPhone extends MyCellPhone implements Camera,Wifi{

    public void takePick(){
        System.out.println("Taking Pick Done");
    }
    public void recordVideo(){
        System.out.println("Record Video Done");
    }
    public void wifiConnect(){
        System.out.println("Wifi Connected Done");
    }
    public void allNetwork(){
        System.out.println("There is 3 networks connected");
    }
    // public void takeSnap(){
    //     System.out.println("Takin snapfrom smartphone");
    // }

    void pickCall(){
        System.out.println("SmartPhone pick call Done");
    }
}



public class inheritance_inte {
    public static void main(String[] args) {

        // MyCellPhone nokia = new MySmartPhone();
        // nokia.pickCall();
         // nokia.recordVideo();  //cannot calll
        // nokia.callNumber();

        // Camera c = new MySmartPhone();
        // c.recordVideo();
        // c.takePick();

        MySmartPhone vivo = new MySmartPhone();
        vivo.allNetwork();
        vivo.takeSnap();

        
    }
    
}
