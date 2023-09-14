import java.util.Scanner;

public class PrimeLoop {

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; // It's a prime number
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        for(int i=1;i<=number;i++){
             if (isPrime(i)) {
            System.out.print(i +" ");
        }
        }

       
    }
}
