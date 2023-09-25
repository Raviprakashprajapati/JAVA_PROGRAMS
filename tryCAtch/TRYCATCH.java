
import java.util.Scanner;

class MyException extends Exception {
    public String toString() {
        
        return "toString()";
    }

    public String getMessage(){
        return "getMessage()";
    }
}


public class TRYCATCH {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        try {

            int result = 454/num;
         
            throw new MyException();
            
        } catch (MyException e) {
            System.out.println(e.toString());
        }

    }
}
