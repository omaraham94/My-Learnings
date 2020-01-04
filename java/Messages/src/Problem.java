import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        int n,q;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        q = scan.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0;i<n;i++) {
            int val = scan.nextInt();
            int numOnes = findNumOnes(val);
            a[i] = numOnes;
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(Integer val : a) {
            System.out.print(val + " ");
        }
        System.out.println();
        for(int i = 0;i<q;i++) {
            int k = scan.nextInt();
            int ans=0;
            int sum=0;
            for(int j=0;j<n;j++) {
                sum += a[j];
                ans++;
                if (sum >=k) {
                    break;
                }
            }
            if (sum >= k ) {
                System.out.println(ans);
            } else {
                System.out.println(-1);
            }
        }
    }
    public static int findNumOnes(int val) {
        int ans=0;
        while(val != 0) {
            int q = val/2;
            int r = val%2;
            if (r==1) {
                ans++;
            }
            val = q;
        }
        return ans;
    }
}
