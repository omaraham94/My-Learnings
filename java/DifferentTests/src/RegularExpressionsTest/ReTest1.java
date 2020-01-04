package RegularExpressionsTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReTest1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\(");
        String text = "123-456-7890fdas" +
                "(123) 456-7890dsaf" +
                "123 456 7890fdsaf" +
                "123.456.7890fdsadsg" +
                "+91 (123) 456-7890";
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
