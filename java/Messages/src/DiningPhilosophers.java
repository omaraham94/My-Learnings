import static java.lang.Math.PI;
public class DiningPhilosophers {
    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[10];
        Fork[] forks = new Fork[10];
        for(int i=0;i<forks.length;i++) {
            forks[i] = new Fork("Fork-" + i);
        }
        System.out.println(PI);
        for(int i=0;i<philosophers.length;i++) {
            philosophers[i] = new Philosopher("Philosopher-" + i, forks);
        }
        for(int i=0;i<philosophers.length;i++) {
            (new Thread(philosophers[i])).start();
        }
    }
}

class Fork {
    String name;

    public Fork(String fork) {
        this.name = fork;
    }
}

class Philosopher implements Runnable {
    String name;
    Fork[] forklist;

    public Philosopher(String name, Fork[] forklist) {
        this.name = name;
        this.forklist = forklist;
    }

    public void eat() throws InterruptedException {
        synchronized (forklist) {

                System.out.println(name);
    //            System.out.println(fork1.name + " " + fork2.name);
                System.out.println(name + "beginning to eat");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name + "started eating");
                System.out.println(name + "done eating");
        }
    }

    @Override
    public void run() {
        try {
            eat();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
