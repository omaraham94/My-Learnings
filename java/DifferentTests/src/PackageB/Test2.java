package PackageB;

public abstract class Test2 {
    protected int val = 100;
    public static void main(String[] args) {
        System.out.println("in the main of test2");
    }

    protected void test() {
        System.out.println("in function test2 of package Test2");
    }

    protected abstract void test1();
}
