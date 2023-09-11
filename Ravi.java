import java.util.Scanner;

public class Ravi {

    static boolean prime(int a)
    {
        boolean flag = false;
        for(int i=2;i<=a-1;i++){
                if(a%i==0)
                {
                    flag = true;
                }
        }
        return flag;

        }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println(prime(7));
    

    











































      
    
    }

}

