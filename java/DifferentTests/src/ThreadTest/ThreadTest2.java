package ThreadTest;

public class ThreadTest2 {
    public static void main(String[] args) {
        Flag flag = new Flag(true);
        new Thread(new EvenPrint(flag)).start();
        new Thread(new OddPrint(flag)).start();
    }
}

class Flag {
    boolean state;

    public Flag(boolean state) {
        this.state = state;
    }
}

class EvenPrint implements Runnable{
    Flag flag;

    public EvenPrint(Flag flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        for(int i=0;;i=i+2) {
            synchronized (flag) {
                while(!flag.state) {
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(i);
                flag.state = false;
                flag.notifyAll();
            }

        }
    }
}

class OddPrint implements Runnable{
    Flag flag;

    public OddPrint(Flag flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        for(int i=1;;i=i+2) {
            synchronized (flag) {
                while(flag.state) {
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(i);
                flag.state = true;
                flag.notifyAll();
            }
        }
    }
}

