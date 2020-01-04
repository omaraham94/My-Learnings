package ArraysTest;

import java.util.*;
import java.util.stream.Collectors;

class Obj {
    String name;
    int age;
    public Obj(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static int compageByAge(Obj o1, Obj o2) {
        return o1.age - o2.age;
    }
}
public class ArraysTest {

    public static void main(String[] args) {
        List<Obj> a = new ArrayList<>();
        a.add(new Obj("atul", 10));
        a.add(new Obj("ank", 11));
        a.add(new Obj("ts", 5));
        a.add(new Obj("thateee", 7));

        Collections.sort(a, Obj :: compageByAge );
//        List<Integer> b = new ArrayList<>(a);
//
        a.add(3, new Obj("wowmomo", 100));

        for(Obj o1 : a) {
            System.out.println(o1.name + " " + o1.age);
        }
        Obj[] b = a.toArray(new Obj[a.size()]);
        for(int i=0;i<b.length;i++) {
            System.out.println(b[i].name);
        }
        List<Obj> c = new ArrayList<>(Arrays.asList(b));
        for(Obj employee : c) {
            System.out.println(employee.name);
        }
        List<Obj> d =  c.stream().sorted((o1, o2) -> o1.name.compareTo(o2.name)).collect(Collectors.toList());

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(arr, 6, 10, 7);
        System.out.println(index);
    }
}
