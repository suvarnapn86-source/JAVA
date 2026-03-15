import java.lang.Runnable;
import java.lang.Thread;

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running. Thread ID:" + java.lang.Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "finished.");
    }
}
public class RunnableSeparateObjects {
    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable("Thread-1");
        MyRunnable runnable2 = new MyRunnable("Thread-2");
        Thread t1=new Thread(runnable1);
        Thread t2=new Thread(runnable2);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads finished. Main thread exiting.");
    }
}

