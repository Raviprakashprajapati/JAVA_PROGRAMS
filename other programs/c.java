import java.util.Scanner;

public class c {
    public static void main(String[] args) {

        Scanner scan  = Scanner(System.in);

              // resver of number
        int num = scan.nextInt();
        int reverse = 0;
        while (num>0) {
            reverse = reverse*10 + num%10;
            num=num/10;
        }
        System.out.println(reverse);
        
    }
    
}
