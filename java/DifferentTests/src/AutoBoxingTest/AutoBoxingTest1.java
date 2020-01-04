package AutoBoxingTest;
/*
There is difference between the below two statements.
In the first statement, flag is pointing to a new location in memory which has true
In the second statement, flag is pointing to a new location which has value false
 */
public class AutoBoxingTest1 {
    public static void main(String[] args) {
        Boolean flag = new Boolean(true);
        flag = false;
        boolean flag1 = false;
        System.out.println(flag == flag1);

        Boolean flag4 = new Boolean(true);
        boolean flag5 = true;
        System.out.println(flag4 == flag5);

        Boolean flag2 = new Boolean(true);
        Boolean flag3 = new Boolean(true);
        System.out.println(flag3 == flag2);
    }
}
