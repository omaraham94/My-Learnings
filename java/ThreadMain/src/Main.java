import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[31m"+ "Hello from the main thread");
        Thread anotherthread = new AnotherThread();
        anotherthread.setName("Another Thread");

        new Thread() {
            @Override
            public void run() {
                System.out.println("\u001B[34m" + "This is another thread from anonymous class " + currentThread().getName());
            }
        }.start();
        anotherthread.start();
        System.out.println( "\u001B[35m"+ "Hello again from main thread");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is runnable method ");
            }
        });
        System.out.println("just now got up");
    }
}
