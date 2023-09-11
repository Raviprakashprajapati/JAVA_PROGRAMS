package myPackage.myShape;

public class Circle extends ShapeValue {
  public  Circle(int r)
    {
        super(r, -1);
    }


    public void area(){
        System.out.println("Area of circle: " + (Math.PI*(this.value1*(this.value1))));
    }

}
