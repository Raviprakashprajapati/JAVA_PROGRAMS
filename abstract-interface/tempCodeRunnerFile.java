interface Car{

    // void type(){ System.out.println("car type"); }
    void color();
    void weight();
}

interface Tier{
    void tierBrand();
    void tierWeight();
}

class Ferrari implements Car,Tier{

    public void color(){
        System.out.println("Yellow ferrari color");
    }
    public void weight(){
        System.out.println("Weight of ferraio is 300KG");
    }
    public void tierBrand(){
        System.out.println("MRF tierbrand in Ferrari");
    }
    public void tierWeight(){
        System.out.println("TierWeight of Ferrari is 20KG");
    }
} 


public class interface3 {
    public static void main(String[] args) {

        Ferrari ravi = new Ferrari();
        ravi.color();
        ravi.weight();
        ravi.tierBrand();
    }
    
}
