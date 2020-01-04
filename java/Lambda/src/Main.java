import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        (new Thread(()-> {
//            System.out.println("tihs is from lambda expression");
//            System.out.println("this is line 2");
//            System.out.println("this is line 3");
//        })).start();
        Employee john = new Employee("john", 29);
        Employee jack = new Employee("jack", 30);
        Employee jill = new Employee("jill", 28);
        Employee snow = new Employee("snow", 35);
        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(jack);
        employees.add(jill);
        employees.add(snow);
        Comparator<Employee> sortbyname = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        hello();
        Comparator<Employee> sortbyage = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Comparator<Employee> lsortbyage = (employee1, employee2) -> employee1.getAge() - employee2.getAge();
//        Collections.sort(employees, sortbyage);
        Collections.sort(employees, (Employee o1, Employee o2) ->
                o1.getAge() - o2.getAge());
        for(Employee employee : employees) {
            System.out.println("Name :- " + employee.getName() + " Age :- " + employee.getAge() );
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("class name is:- " + getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}