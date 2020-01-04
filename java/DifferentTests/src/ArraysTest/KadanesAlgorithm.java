package ArraysTest;

import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n;
            n = scanner.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = scanner.nextInt();
            }
            int currentSum = 0;
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                currentSum += a[i];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                if (currentSum < 0) {
                    currentSum = 0;
                }
            }
            System.out.println(maxSum);
        }
    }
}
