import java.util.Scanner;

public class Ravi {

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

       
       
    }
}
