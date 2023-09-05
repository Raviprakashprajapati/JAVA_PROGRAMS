class Circle{
    int radius;

    Circle()
    {

    }

    Circle(int r){
        radius = r;
    }

    double area(){
        return Math.PI*radius*radius;
    }

}

class Cylinder extends Circle{
    int height;

    Cylinder(int r,int h)
    {
        // super(r);
        radius = r;
        height = h;

    }

    double volume(){
        return Math.PI*radius*radius*height;
    }
}



public class Ravi {
    public static void main(String[] args) {

        Cylinder a = new Cylinder(3, 78);
        System.out.println("arae of circle " + a.area());
        System.out.println("vol of cylinder " + a.volume());

            

        
    }
}

  
