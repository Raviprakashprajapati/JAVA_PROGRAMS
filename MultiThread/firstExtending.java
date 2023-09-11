
class Thread1 extends Thread{
    @Override
    public void run(){
        int i=1;
       while (i<3) {
         System.out.println("Chatting with Thread1");
        i++;
        }
    }

   
}


class Thread2 extends Thread{
    public void run(){
        int i=1;
        while (i<3) {
            System.out.println("Cooking with Thread2");
            i++;
        }

    }
}



public class firstExtending {
    public static void main(String[] args) {

        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        //both strat with same time means 
        th1.start();
        th2.start();
        
        
        
    }
    
}
