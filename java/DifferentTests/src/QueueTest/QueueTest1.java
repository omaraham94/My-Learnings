package QueueTest;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest1 {
    public static void main(String[] args) {
        List <String> s = new Stack<>();
        Queue <String> q = new LinkedList<>();
        q.add(null);
        String str = q.remove();
        if (str == null) {
            System.out.println("null");
        } else {
            System.out.println("not null");
        }
        q.add("atul");
        System.out.println(q.peek());
        System.out.println(q.peek());
    }
}
