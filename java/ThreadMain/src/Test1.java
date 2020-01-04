import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Integer[] a = {21,3,2,421,42,421,421,3,43,4,325,23};
        Arrays.sort(a,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for(int val : a ) {
            System.out.println(val);
        }
    }
}
