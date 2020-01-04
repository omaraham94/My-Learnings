package PackageA;

import PackageB.Test2;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("in main of test1");
        Test2Extended t2 = new Test2Extended();
    }

    public void test1() {
        System.out.println("in the method test1");
    }
}

class Test2Extended extends Test2 {
    public void test() {
        super.test();
        System.out.println(val);
    }
    public void test1() {
        System.out.println("in test1 of test2");
    }
}
