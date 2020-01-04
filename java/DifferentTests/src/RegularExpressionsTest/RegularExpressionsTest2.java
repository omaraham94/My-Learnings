package RegularExpressionsTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsTest2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\(.*?\\))");
        String text = "(flkdsa) (( fda)";
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
