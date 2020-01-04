import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "abcDeefjlkdabcDeejflkdsajlkfd";
        System.out.println(s.matches("abcDee"));

        System.out.println(s.replaceAll("^abcDee", "Hello"));
        System.out.println(s);
        s = s.toUpperCase().charAt(0) + s.substring(1);
        System.out.println(s);

        Pattern pattern = Pattern.compile("(<h2>)|(<h1>)");
        String str = "<h1>fdsafa<h1> <h3> <h2> <h2> <fdsaf>FdsfDSA";
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            if(matcher.group(1) != null) {
                System.out.println("Occurances :- " + matcher.group(1));
            }
        }
    }
}
