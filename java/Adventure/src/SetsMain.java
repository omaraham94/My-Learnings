import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class SetsMain {
    public static Map<Integer, Integer> intMap = new HashMap<>();
    public static void main(String[] args) {
        Map<String, String> hashmap = new HashMap<>();
        Map<String,String> treemap = new TreeMap<>();
        Map<String, String> linkedmap = new LinkedHashMap<>();
        
        hashmap.put("this", "that");
        hashmap.put("atul", "ankit");
        hashmap.put("yeast", "beast");
        hashmap.put("what", "where");

        treemap.put("this", "that");
        treemap.put("atul", "ankit");
        treemap.put("yeast", "beast");
        treemap.put("what", "where");

        linkedmap.put("this", "that");
        linkedmap.put("atul", "ankit");
        linkedmap.put("yeast", "beast");
        linkedmap.put("what", "where");

        System.out.println("========================================");
        for(String key : hashmap.keySet()) {
            System.out.println(" key is " + key + " value is " + hashmap.get(key));
        }
        System.out.println("========================================");


        System.out.println("========================================");
        for(String key : treemap.keySet()) {
            System.out.println(" key is " + key + " value is " + treemap.get(key));
        }
        System.out.println("========================================");


        System.out.println("========================================");
        for(String key : linkedmap.keySet()) {
            System.out.println(" key is " + key + " value is " + linkedmap.get(key));
        }
        System.out.println("========================================");
    }
}
