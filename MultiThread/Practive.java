//question1 
class MyThread extends Thread{
  public  void run(){
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
            
        }
    }
}

class MyThread2 extends Thread{
  public  void run(){
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
           
            System.out.println("morning");
            
        }
    }
}



public class Practive {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.setPriority(4);
        t2.setPriority(1);
        t1.start();
        t2.start();


        
    }
    
}
