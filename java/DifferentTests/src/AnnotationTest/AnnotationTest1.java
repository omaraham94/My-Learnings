package AnnotationTest;

import java.util.ArrayList;

public class AnnotationTest1  {
    @SuppressWarnings("deprecation")
    public static void main(String args[]){
        ArrayList list=new ArrayList();
        A a = new A(10,20);
        list.add("sonoo");
        list.add(1);
        list.add("ratan");
        list.add(a);

        for(Object obj:list)
            System.out.println(obj);
        a.hello();
    }
}

class A {
    int a;
    int b;
    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString() {
        return (Integer.toString(a+b));
    }

    @Deprecated
    public void hello() {
        System.out.println("hello");
    }
}