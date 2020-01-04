package VarArgsTest;

public class VarArgsTest1 {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5,6));
        System.out.println(add(1,2));
    }
    public static int add(int ...val) {
        int result=0;
        for(int i : val) {
            result +=i;
        }
        return result;
    }
}
