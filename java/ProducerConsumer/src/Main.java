import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();
        (new Thread(new MyProducer(buffer))).start();
        (new Thread(new MyConsumer(buffer, "Consumer-1"))).start();
        (new Thread(new MyConsumer(buffer, "Consumer-2"))).start();
    }
}

class MyProducer implements Runnable {
    List<String> buffer;

    public MyProducer(List<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        String[] data = {"1", "2", "3", "4", "5"};
        for(int i=0;i<data.length; i++) {
            synchronized (buffer) {
                this.buffer.add(data[i]);
                System.out.println("Adding... " + data[i]);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (buffer) {
            this.buffer.add("EOF");
        }
    }
}

class MyConsumer implements Runnable {
    List<String> buffer;
    String name;

    public MyConsumer(List<String> buffer, String name) {
        this.buffer = buffer;
        this.name = name;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (buffer) {
                if (buffer.isEmpty()) {
//                System.out.println("in loop");
                    continue;
                }
                if (buffer.get(0).equals("EOF")) {
//                System.out.println("in elseif");
                    break;
                } else {
                    System.out.println(name + " Item got is :- " + buffer.get(0));
                    buffer.remove(0);
                }
            }
        }
    }
}