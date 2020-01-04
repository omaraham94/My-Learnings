package ThreadTest;
/*
There is some difference between thread.wait() and object.wait()
Here if object.wait() is replaced by thread.wait(), it will not run and throw monitor exception.
Reason not known yet.
 */
public class ThreadTest1 {

    public static void main(String[] args) {
        ThreadTest1.Counter counter = new ThreadTest1(). new Counter();
        new Thread(new ThreadTest1().new EvenPrint(counter)).start();
        new Thread(new ThreadTest1().new OddPrint(counter)).start();
    }

    class Counter {
        int counter=0;
        static final int MAX_COUNT = 100;
        public void printEven(){
//        while (this.counter < this.MAX_COUNT) {
//            synchronized (this) {
//                while (this.counter % 2 !=0) {
//                    try {
//                        wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println(this.counter);
//                this.counter++;
//                notifyAll();
//            }
//        }
        }

        public void printOdd() {
//        while (this.counter < this.MAX_COUNT){
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            synchronized (this) {
//                while ((this.counter%2) == 0) {
//                    try {
//                        wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println(this.counter);
//                this.counter++;
//                notifyAll();
//            }
//        }
        }
    }

    class EvenPrint implements Runnable{
        Counter counter;

        public EvenPrint(Counter counter) {
            this.counter = counter;
            System.out.println(counter);
        }

        @Override
        public void run() {
            counter.printEven();
            synchronized (counter) {
                while (counter.counter < counter.MAX_COUNT) {

                    while (counter.counter % 2 !=0) {
                        try {
                            counter.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(counter.counter);
                    counter.counter++;
                    counter.notifyAll();
                }
            }
        }
    }

    class OddPrint implements Runnable {
        Counter counter;
        public OddPrint(Counter  counter) {
            this.counter = counter;
            System.out.println(counter);
        }

        @Override
        public void run() {
            counter.printOdd();
            synchronized (counter) {
                while (counter.counter < counter.MAX_COUNT){
                    while ((counter.counter%2) == 0) {
                        try {
                            counter.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(counter.counter);
                    counter.counter++;
                    counter.notifyAll();
                }
            }
        }
    }
}

