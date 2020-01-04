import java.net.URLEncoder;
import java.util.stream.StreamSupport;
import com.example.test.*;

public class Dog {
    public Dog(String name) {
        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" + name );
    }

    public static void main(String []args) throws Exception {
        // Following statement would create an object myDog
        Test a = new Test();
        Test.A c = a.new A();
        System.out.println("this is the value of a " + c.a);
        String s = "this";
        String b = new String("this");
        if (s == b) {
            System.out.println("both point to same location");
        } else {
            System.out.println("they dont point to same location");
        }

    }
}