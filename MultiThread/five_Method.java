class MyThread extends Thread {
  
    public void run(){
        System.out.println("run.........");
    }
}

class MyThread2 extends Thread {
  
    public void run(){
        System.out.println("run......... thread2");
    }
}



public class five_Method {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        try {
                
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();


        
    }
    
}
