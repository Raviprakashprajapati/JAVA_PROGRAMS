import javax.naming.directory.InvalidAttributesException;

// class MyException extends Exception{
//     public String geString(){
//         return "i am getString";
//     }
// }


class Calculator{
    public int x,y;
    double add(double x, double y) throws InvalidAttributesException 
    {
        if(x==8 || y==9)
        {
            throw new InvalidAttributesException("input error 8 or 9");
        }
        return x + y;
    }
    double subtract(double x, double y)
    {
        return x - y;
    }
    double multiply(double x, double y){
        return x * y;
    }
    double divide(double x, double y){
        return x / y;
    }
}


public class CUSTOMCALUCULATOR{
    public static void main(String[] args) throws  InvalidAttributesException {

        
        Calculator a = new Calculator();
        a.add(8, 9);
        System.out.println("Fd");



    }
}