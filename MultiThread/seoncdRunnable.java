
class Runnable1 implements Runnable 
{
    public void run(){
       int i=0;
       while(i<5){
          System.out.println("Runnable 1......");
          i++;
       }
    }
}


class Runnable2 implements Runnable 
{
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("Runnable 2......");
            i++;
        }
    }
}

public class seoncdRunnable {
    public static void main(String[] args)
    {
        Runnable1 bullet1 = new Runnable1();
        Runnable2 bullet2 = new Runnable2();
        // bullet1.run();
        // bullet2.run();
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
    
}
