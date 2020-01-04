package banking;

public class Animal extends Object{
    private String name;
    private String age;
    public Animal() {
        System.out.println("animal got called");
    }
    public Animal(String name, String age) {
        System.out.println("Animal got called");
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("puppy", "18");
        d1.bark();
        System.out.println(d1.toString());
//        Animal a1 = new Animal();
    }
}
