import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        
        // count digit
        int a = scan.nextInt();
        int count = 0;
        while (true) {
            if (a > 0) {
                a = a / 10;
                count++;
            } else {
                break;
            }

        }
        System.out.println(count);
    }
    
}
