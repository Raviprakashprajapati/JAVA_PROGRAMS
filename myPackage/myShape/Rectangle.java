package myPackage.myShape;

public class Rectangle extends ShapeValue {
   public Rectangle(int l,int b)
    {
        super(l, b);
    }


    public void area(){
        System.out.println("Area of rectangle: " + (this.value1*this.value2));
    }

    
    
    
    
}
