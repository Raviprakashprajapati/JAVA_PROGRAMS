
class Base implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Base ....");
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}

class Base2 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Derive ....");
                Thread.sleep(2000);
            } catch (Exception e) {
            }

        }
    }
}

public class threadRunnable02 {
    public static void main(String[] args) {

        Runnable x = new Base();
        Runnable y = new Base2();

        Thread th = new Thread(x);
        Thread th2 = new Thread(y);

        th.start();
        th2.start();
    }
}
