
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }

    public void run(){
        System.out.println("RUn...................");
    }

}


public class thirdConturtor {
    public static void main(String[] args) {
        
        MyThread x = new MyThread("Ravi pa");
        x.start();
        System.out.println("id is: "+ x.getId());
        System.out.println(x.getName());
      

    }
    
}
