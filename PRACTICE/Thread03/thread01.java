
class Base extends Thread{
    public void run(){
        for(int i=0;i<100;i++)
        {
            try {
                System.out.println("Base ....");
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}

class Base2 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
                           try {
                System.out.println("Derive ....");
                Thread.sleep(2000);
            } catch (Exception e) {
            }
 
        }
    }
}

public class thread01 {
    public static void main(String args[])
    {
        Base x = new Base();
        Base2 y = new Base2();
        // System.out.println(x.getPriority());
        // System.out.println(y.getPriority());
        y.setPriority(10);
        x.setPriority(1);
        x.start();
        y.start();

    }
    
}
