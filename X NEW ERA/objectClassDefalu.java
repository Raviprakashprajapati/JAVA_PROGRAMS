
class Base{
    int name;
    Base(int b){
        System.out.println("this "+this+ " is "+b);
    }

    public Base() {
    }

    public String toString(){
        return "gfdhdfhgh";
    }

    public boolean equals(Base obj)
    {
        return this.name==obj.name;
    }

    void show(){
        System.out.println("show mth caleed "+name);
    }
}

public class objectClassDefalu {
    public static void main(String[] args) {
    
        
        // Base b = new Base(24);
        //b and b.tostring() both same
        // System.out.println("b "+ b);
        // System.out.println(b.toString());
        // System.out.println(b.hashCode());
        
        // Base b2 = new Base(45);
        // System.out.println("b2 = " + b2);

        // equal---
        Base b = new Base();
        b.name=5;

        Base b2 = new Base();
        b2.name =5;
        System.out.println(b);
        System.out.println(b2);
        System.out.println(b.equals(b2));
        System.out.println(b.getClass());
       
        
    }
    
}
