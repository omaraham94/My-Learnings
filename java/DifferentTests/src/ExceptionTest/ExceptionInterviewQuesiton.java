package ExceptionTest;

public class ExceptionInterviewQuesiton {
    public static void main(String[] args) {
        exceptionTest();
    }
    public static int exceptionTest() {
        try {
            throw new Exception("not allowed");
        //    return 0;
        } catch (Exception e) {
            System.out.println("in catch");
            return 0;
        } finally {
            System.out.println("in finally");
        }
    }
}
