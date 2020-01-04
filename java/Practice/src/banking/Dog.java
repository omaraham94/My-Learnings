package banking;

public class Dog extends Animal {
    Dog() {
        System.out.println("Dog got called");
    }
    Dog(String name, String age) {
        super(name, age);
        System.out.println("Dog1 got called");
    }
    public void bark() {
        System.out.println("bark");
    }
}
