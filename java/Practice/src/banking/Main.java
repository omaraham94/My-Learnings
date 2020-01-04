package banking;

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer(100, 0, false);
        p.printPage(10);
        System.out.println(p.getTonerLevel());
        System.out.println(p.getNumberPages());
    }
}
