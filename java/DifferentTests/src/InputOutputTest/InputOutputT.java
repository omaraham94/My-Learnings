package InputOutputTest;

import java.util.Scanner;

public class InputOutputT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String[] s = new String[n];
            for(int j=0;j<n;j++) {
                s[j] = scanner.next();
            }
            for(String c : s) {
                char ch = c.charAt(0);
                System.out.println(c.charAt(0));
            }
        }
    }
}
