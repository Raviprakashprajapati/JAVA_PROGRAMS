
public class Trycatch2 {
    
    static int divide(int num) throws ArithmeticException{
        int result = 34/num;
        return result;
    }

    public static void main(String[] args) {
        
       try {
        int a = 0 ;
        int result = 3455/a;
        System.out.println(result);
        
       } catch (Exception e) {
        
        System.out.println("Error "+  e);
       }
       finally{
        System.out.println("finally");
       }







    }
    
}
