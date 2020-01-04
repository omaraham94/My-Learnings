package com.example.test;

public class Test {
    public class A {
        public A() {
            System.out.println("this is A");
        }
        public int a=10;
        void fun1() {
            System.out.println("this is class A" );
        }
    }

    public class B {
        private int b = 20;
        void fun1() {
            System.out.println("this is class B");
        }
    }
    void printab() {
        A a = new A();
        B b = new B();
        System.out.println(" A is " + a.a+ "B is " + b.b);
    }
}