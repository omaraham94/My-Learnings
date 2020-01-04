package DoubtInheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class A {
    int a=1;
    int b=2;
    int c=3;
    public void print1() {
        System.out.println("print1");
    }

    public void print2() {
        System.out.println("print2");
    }
}

class B extends A {
    int d=4;
    public void print3() {
        System.out.println("print3");
    }

    public void print4 () {
        System.out.println("print4");
    }
}

class C extends A {
    int e=5;
    public void print5() {
        System.out.println("print5");
    }

    public static void main(String[] args) {
        System.out.println("main");
    }

    public void print6() {
        System.out.println("print6");
    }
}

public class Main {
    public static void main(String[] args) {
        B a = new B();
        a.print3();
        String[] str = new String[] {"this", "that", "what", "where"};
        Arrays.sort(str, (s1,s2)-> s2.compareTo(s1));
        C c = new C();
        c.main(new String[]{""});
        List<String> l = Arrays.asList(str);
        l.forEach(System.out :: println);
    }
}
