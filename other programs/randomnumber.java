import java.util.Random;
import java.util.Scanner;

class GuessNumber{
    int number;
    int guess;
    int count=1;

    void play(){
        Scanner scan  = new Scanner(System.in);
        Random rand = new Random();
        number = rand.nextInt(100);
        System.out.println("Enter number = ");
        while(true)
        {
            guess = scan.nextInt();
            if(guess==number)
            {
                System.out.println("Congrats Number is " + number);
                System.out.println("No  of guesss is "+ count);
                break;
            }
            else if(guess>number)
            {
                System.out.println("greater");
                count++;
            }
            
            else if(guess<number)
            {
                System.out.println("Smaller");
                count++;
            }
            else
            {
                System.out.println("Error");
                break;
            }

        }

        scan.close();
    }
}

public class randomnumber {
    public static void main(String[] args) {
        
        GuessNumber ravi = new GuessNumber();
        ravi.play();


    }
    
}
