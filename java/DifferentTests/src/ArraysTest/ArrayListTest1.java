package ArraysTest;

import com.sun.javafx.collections.ImmutableObservableList;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("atul");
        l.add("ankit");
        l.add("this");
        l.add("that");
        List<String> unmodifiableList = Collections.unmodifiableList(l);

    }
}
//
//class MyArrayList extends ArrayList {
//    ArrayList
//}