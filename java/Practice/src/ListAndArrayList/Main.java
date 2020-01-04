package ListAndArrayList;

import banking.Array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GroceryList grocery = new GroceryList();
        grocery.add("milk");
        grocery.add("butter");
        grocery.add("curd");
        System.out.println("before");
        grocery.printitems();
        ArrayList<String> newArray;
        newArray = grocery.getGroceryList();
        newArray.set(1,"ghee");
        System.out.println("new list");
        for(String item : newArray) {
            System.out.println(item);
        }
        System.out.println("old list");
        for(String item : grocery.getGroceryList()) {
            System.out.println(item);
        }
    }
}
