package Test1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String s = scanner.nextLine();
        String pattern ="";
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '*') {
                pattern = pattern + "[a-zA-Z][a-zA-Z][a-zA-Z]+";
            }
            else if (s.charAt(i) == '?') {
                pattern = pattern + "[a-zA-Z]{0,2}";
            }
            else if (s.charAt(i) == '-') {
                //do something
            }
            else {
                pattern += s.charAt(i);
            }
        }
        System.out.println(pattern);
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(text);
        while(matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.end());
        }
    }

}
