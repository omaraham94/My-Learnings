

class DivisionExceptionTest {
    public static void main(String[] args) {
        int x=10;
        int y=0;
        try {
            Division.divide(x,y);
        } catch (DivideByZero divideByZero) {
            divideByZero.printStackTrace();
        }
    }
}

final class Division {
    int x;
    int y;
    private Division() {}

    public static double divide(int x,int y) throws DivideByZero{
        if (y == 0) {
            throw new DivideByZero(y);
        } else {
            return x/y;
        }
    }
}

class DivideByZero extends Exception {

    public DivideByZero() {
        super();
    }

    public DivideByZero(int y) {
        super("Division by 0 is not allowed");
    }

}
