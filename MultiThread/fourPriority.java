class MyThread extends Thread {
   public MyThread(String name)
   {
    super(name);
   }

   public void run(){
    System.out.println("Run..... " + this.getName());
   }

}



public class fourPriority {
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread("ravi1");
        MyThread t2 = new MyThread("ravi2");
        MyThread t3 = new MyThread("ravi3");
        MyThread t4 = new MyThread("ravi4");
        MyThread t5 = new MyThread("ravi5 !IMPORTANT");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
