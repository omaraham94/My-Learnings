import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Try {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        Integer[] a = {1,2,3,4,5};
        getAllSets(a, null, 0,arr);
        Collections.sort(arr, (list1, list2) -> list1.size()-list2.size());
        for(List<Integer> l2 : arr) {
            for(Integer val : l2) {
                if(val == -1)
                    continue;
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
    private static void getAllSets(Integer[] a,List<Integer> l, int i ,List< List<Integer>> arr) {
        if( i == a.length) {
            arr.add(l);
        } else {
            if (l == null) {
                List<Integer> l1 = new ArrayList<>();
                l1.add(-1);
                List<Integer> l2 = new ArrayList<>();
                l2.add(-1);
                l1.add(a[i]);
                getAllSets(a, l1, i + 1, arr);
                getAllSets(a, l2, i + 1, arr);
            }
            else if (l != null) {
                List<Integer> l1 = new ArrayList<>(l);
                List<Integer> l2 = new ArrayList<>(l);
                l1.add(a[i]);
                getAllSets(a, l1, i + 1, arr);
                getAllSets(a, l2, i + 1, arr);
            }
        }
    }
}
