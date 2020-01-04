import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        (new Thread(new EvenThread(counter))).start();
        (new Thread(new OddThread(counter))).start();
    }
}

class Counter {
    int count = 0;
    public static final int MAX_COUNT = 100;

    public  void printEven() {
        synchronized (this) {
            while (count < MAX_COUNT) {
                while (count % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println("Thread Even:- " + count);
                count++;
                notifyAll();
            }
        }
    }
    public void printOdd() {
        synchronized (this) {
            while (count < MAX_COUNT) {
                while (count % 2 != 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println("Thread odd :- " + count);
                count++;
                notifyAll();
            }
        }
    }
}

class OddThread implements Runnable {
    private final Counter counter;

    public OddThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.printOdd();
    }
}

class EvenThread implements Runnable {
    private final Counter counter;
    public EvenThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.printEven();
    }
}
