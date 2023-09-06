interface Cycle{
    int a=1;
    void applyBrake();
    void speedUp();
}

class Herculies implements Cycle
{
     public void applyBrake(){
        System.out.println("Brake done");
    }
    public void speedUp(){
        System.out.println("speed up done");
    }
}

public class interface2 {
    public static void main(String[] args) {
        
        Herculies r = new Herculies();
        r.applyBrake();
        r.speedUp();
    
        System.out.println(r.a); 


    }
    
}
