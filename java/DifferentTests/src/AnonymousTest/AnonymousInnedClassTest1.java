package AnonymousTest;

public class AnonymousInnedClassTest1 {
    public static void main(String[] args) {
        A a = new A() {
            void print() {
                System.out.println("in A");
            }
        };
        a.print();
    }
}

abstract class A {
     void print(){
         System.out.println("in a");
     }
}
