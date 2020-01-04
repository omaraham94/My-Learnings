public class Test {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            try {
                if (i == 5) {
                    continue;
                } else {
                    System.out.println("Number is " + i);
                }
            } finally {
                System.out.println("in finally " + i);
            }
        }
    }
}
