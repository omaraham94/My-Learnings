package Strings;

public class SubStringTest {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("atuliscoming");
        String s2 = "comingatulis";
        s1.append(s1);
        System.out.println(s1.toString().contains(s2));
    }
}
