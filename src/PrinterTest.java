class Printer{
    public synchronized void printDocument(String docName) {
        System.out.println(Thread.currentThread().getName() + "started printing" + docName);
        try {
            Thread.sleep(2000);
        } catch  (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "finsihing printing" + docName);
    }
    }
    class User extends Thread {
        private Printer printer;
        private String docName;

        public User(Printer printer, String docName) {
            this.printer = printer;
            this.docName = docName;
        }

        @Override
        public void run() {
            printer.printDocument(docName);
        }
    }
    public class PrinterTest {
        public static void main(String[] args) {
            Printer sharedPrinter = new Printer();
            User u1 = new User(sharedPrinter, "Documnet1");
            User u2 = new User(sharedPrinter, "Documnet2");
            User u3 = new User(sharedPrinter, "Documnet3");
            u1.start();
            u2.start();
            u3.start();
        }
    }


