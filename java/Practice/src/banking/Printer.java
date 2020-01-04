package banking;

public class Printer {
    private int tonerLevel;
    private int numberPages;
    private boolean isDuplex;
    public Printer() {
        this(0,0,false);
    }

    public Printer(int tonerLevel, int numberPages, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.numberPages = numberPages;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int tonerLevel) {
        this.tonerLevel += tonerLevel;
        if (this.tonerLevel > 100) {
            this.tonerLevel = 100;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void printPage(int numberPages) {
        if (this.tonerLevel < numberPages) {
            System.out.println("cant print these many pages.");
        } else {
            System.out.println("printing " + numberPages + " pages.");
            this.numberPages += numberPages;
            this.tonerLevel -= numberPages;
        }
    }
}
