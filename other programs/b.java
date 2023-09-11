import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

          // sum og digit
        int num = scan.nextInt();
        int sum = 0;
        while(num>0){
            
            sum+=num%10;
            num=num/10;

        }
        System.out.println(sum);

        
    }
    
}
