package com.example.test;

public class C {
    public static void main(String[] args) {
        Test a= new Test();
        Test.A a1 = a.new A();
        a1.fun1();

    }
}
