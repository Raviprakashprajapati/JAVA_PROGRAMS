import java.util.Scanner;

public class d {
    public static void main(String[] args) {

        Scanner scan = Scanner(System.in);
        
             // sum of 1-2+3-4.....n
             int num = scan.nextInt();
             int sum = 0;
             int i = 0;
             while(i<=num){
                 if(i%2==0){
                     sum+=i;
                     i++;
                 }
                 else{
                     sum-=i;
                     i++;
                 }
             }
             System.out.println(sum);
    }
    
}
