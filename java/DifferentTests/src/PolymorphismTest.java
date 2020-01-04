public class PolymorphismTest {
    public static void main(String[] args) {
        A a = new A(1,2);
        B b = new B(1,2,3);
        A test = a;
        test.fun1();
        test= b;
        test.fun1();
        A d = new A(1,2) {
            @Override
            public int getA() {
                System.out.println("a");
                return 10;
            }

            @Override
            public int getB() {
                return super.getB();
            }

            @Override
            public void fun1() {
                super.fun1();
            }
        };
    }
}

class A {
    int a;
    int b;
    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void fun1() {
        System.out.println(a + " " + b);
    }
}

class B extends A {
    int c;

    public B(int a, int b, int c) {
        super(a,b);
        this.c = c;
    }
    public void fun1() {
        System.out.println(a + " " + b + " " + c);
    }
}