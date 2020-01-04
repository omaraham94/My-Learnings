package HashMapTest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("this", "that");
        m.put("what", "where");
        m.put("which", "when");
        for(String key : m.keySet()) {
            System.out.println(m.get(key));
        }
    }
}
