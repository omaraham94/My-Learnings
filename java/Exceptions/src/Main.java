import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(divideEAFP(1,0));
//        String s = Main.getInt();
//        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);
        int i = scanner.nextInt();
        String s1 = scanner.nextLine();
        System.out.println(i);
        if (s1.equals("")) {
            System.out.println("empty line");
        } else {
            System.out.println(s1);
        }

//        boolean flag = true;
//        for(int i=0;i<s.length();i++){
//            if (s.charAt(i) >= '0' && s.charAt(i) <='9') {
//            } else {
//                flag = false;
//                break;
//            }
//        }
//        System.out.println("\u00ae");
//        if (flag) {
//            System.out.println("valid");
//        } else {
//            System.out.println("invalid");
//        }
//        int a = new Integer("123");
//
//
//        Integer val = Integer.parseInt(s,8);
//        System.out.println(val);
//        System.out.println(Integer.toHexString(val));
//
//        Integer i = 116;
//        System.out.println(i);
//        System.out.println("max value of integer is " + Integer.MAX_VALUE);
//        System.out.println("max value of integer is " + Integer.MIN_VALUE);
        divideEAFP(1,0);
    }

    private static String getInt() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    static double divideLBYL (int x, int y) {
        if (y !=0) {
            return x/y;
        } else {
            return 0;

        }
    }

    static double divideEAFP(int x, int y) {
        try {
            return x/y;
        } catch (Exception a) {
            System.out.println("entered " + a.toString());
        }
        return 0;
    }
}