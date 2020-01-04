import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        int[] a = new int[] {2,3,5,1,4,6,9,8,7};
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        maxHeap.add(a[0]);

        for (int i=1;i<a.length; i++) {
            int val = a[i];
            int median = 0;
            if (minHeap.size() == maxHeap.size()) {
                median = (minHeap.peek() + maxHeap.peek())/2;
            } else if (minHeap.size() > maxHeap.size()) {
                median = minHeap.peek();
            } else if (minHeap.size() < maxHeap.size()) {
                median = maxHeap.peek();
            }
            if (val > median) {
                minHeap.add(val);
            } else {
                maxHeap.add(val);
            }
            if (Math.abs(minHeap.size() - maxHeap.size()) > 1 ) {
                if (minHeap.size() > maxHeap.size()) {
                    maxHeap.add(minHeap.remove());
                } else {
                    minHeap.add(maxHeap.remove());
                }
            }
        }

        if (minHeap.size() == maxHeap.size()) {
            System.out.println((double) (minHeap.peek() + maxHeap.peek()) / 2);
        } else if (minHeap.size() > maxHeap.size()) {
            System.out.println(minHeap.peek());
        } else {
            System.out.println(maxHeap.peek());
        }

    }
}
