import java.util.Collections;

public class NewThread {
    public static void main(String[] args) {
        Countdown countdown = new Countdown();
        Countdown countdown1 = new Countdown();
        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
//        if (t1.threadCountdown == t2.threadCountdown) {
//            System.out.println("both are equal");
//        } else {
//            System.out.println("both are not equal");
//        }
//        System.out.println(ThreadColor.ANSI_BLUE + "hi shiva ");
//        System.out.println("hi atul");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}

class Countdown {
    private int i=10;
    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_BLUE;
                break;
            case "Thread 2" :
                color = ThreadColor.ANSI_GREEN;
                break;
            case "Thread 3" :
                color = ThreadColor.ANSI_RED;
                break;
            default :
                color = ThreadColor.ANSI_CYAN;
        }
        while(true) {
            synchronized (this) {
                if(i<=0) {
                    break;
                }
                System.out.println(color + Thread.currentThread().getName() + " : i = " + i);
                i--;
            }
        }
//
//        for (int i = 10; i > 0; i--) {
//            System.out.println(color + Thread.currentThread().getName() + " : i = " + i);
//        }
    }
}

class CountdownThread extends Thread {
    public Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        this.threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}