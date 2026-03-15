class MyThreadDemo extends java.lang.Thread {
    private String name;

    MyThreadDemo(String name) {
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
public class  MyThread {
    public static void main(String[] args) {
        MyThreadDemo t1 = new MyThreadDemo("Thread-1");
        MyThreadDemo t2 = new MyThreadDemo("Thread-2");
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




