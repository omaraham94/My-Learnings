package AnonymousTest;

public class AnonymousTest1 {
    public static void main(String[] args) {
        final int a = 10;
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(a);
            }
        }).start();
    }
}
