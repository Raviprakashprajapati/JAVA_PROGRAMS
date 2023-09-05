
interface Bicycle{

    void brake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void hornBoost();
    void hornLow();
}

class Hercyulies implements Bicycle,HornBicycle{

   public void brake(int decrement)
    {
        System.out.println("Brake done");
    }
   public void speedUp(int increment){
        System.out.println("Speed up done");
    }
    public void hornBoost(){
        System.out.println("Hron boost done");
    }
    public void hornLow(){
        System.out.println("Hron low done");
    }
}




public class interfaceRevice{
    public static void main(String[] args) {

        Hercyulies ravi = new Hercyulies();
        ravi.brake(20);
        ravi.speedUp(20);
        
    }
}