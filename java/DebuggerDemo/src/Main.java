public class Main {
    public static void main(String[] args) {
        printSquareStar(8);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for(int i=0;i<number;i++) {
                System.out.print("*");
            }
            System.out.println();
            for(int i=0;i<number -2;i++) {
                for(int j=0;j<number;j++) {
                    if (j==0 || (j == (number -1))) {
                        System.out.print("*");
                    } else if (j == i+1 || (j == (number-i-2))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            for(int i=0;i<number;i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
























//
//
//    public static void printNumberInWord (int whole) {
//        switch (whole) {
//            case 0:
//                System.out.print("ZERO");
//                break;
//            case 1:
//                System.out.print("ONE");
//                break;
//            case 2:
//                System.out.print("TWO");
//                break;
//            case 3:
//                System.out.print("THREE");
//                break;
//            case 4:
//                System.out.print("FOUR");
//                break;
//            case 5:
//                System.out.print("FIVE");
//                break;
//            case 6:
//                System.out.print("SIX");
//                break;
//            case 7:
//                System.out.print("SEVEN");
//                break;
//            case 8:
//                System.out.print("EIGHT");
//                break;
//            case 9:
//                System.out.print("NINE");
//                break;
//            default :
//                System.out.println("OTHER");
//                break;
//        }
//        System.out.print(" ");
//    }
//    public static void numberToWords(int number) {
//        if (number < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            int[] a = new int[100];
//            int j=0;
//            for (int i=0;i<a.length;i++) {
//                a[i] = -1;
//            }
//            while(number != 0) {
//                int r = number %10;
//                number = number / 10;
//                a[j] = r;
//                j++;
//            }
//            System.out.println(a[0] + " " + a[1]);
//            int index=0;
//            for (int i=0;i<a.length;i++) {
//                if (a[i] == -1) {
//                    index = i;
//                    break;
//                }
//            }
//            for (int i=index-1; i >=0;i--) {
//                printNumberInWord(a[i]);
//            }
//        }
//    }
}
