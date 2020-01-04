package ExceptionTest;

public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            double x = Divide.divide(1, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

final class Divide {
    public static double divide(int x, int y) throws DivideBy0 {
        if (y==0) {
            throw new DivideBy0();
        } else {
            return x/y;
        }
    }
    public static double divide (){return 0;}
}

class DivideBy0 extends Exception {
    public DivideBy0() {
            super("div by 0 not allowed");
    }
}
