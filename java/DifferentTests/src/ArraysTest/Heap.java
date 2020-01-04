package ArraysTest;

public class Heap {
    public static void main(String[] args) {
        int[] a = {1,5,3,7,2,4,8,6};
        heapSort(a);
    }

    public static void heapify(int[] a, int i, int n) {
        int left = i*2+1;
        int right = i*2+2;
        int largest;
        if (left < n && a[left] > a[i]) {
            largest = left;
        } else {
            largest = i;
        }
        if (right < n && a[right] > a[largest]) {
            largest = right;
        }
        if (largest != i) {
            //swap(a[i], a[largest]);
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a,largest, n);
        }
    }

    public static void heapSort(int[] a) {
        for(int i=a.length/2 -1;i >=0; i--) {
            heapify(a,i,a.length);
        }
        for(int i=a.length-1; i>=0;i--) {
            //swap(a[0],a[i]);
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a,0,i);
        }
        for(int val : a) {
            System.out.println(val);
        }

    }
}
