import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(", |\n|\r\n|\\s+");
        ArrayList<Integer> arr = new ArrayList<>();
        String s12 = "1.323123";
        double d = Double.parseDouble(s12);
        System.out.println(d);
//        int val = scanner.nextInt();
//        System.out.println(val);
//        String s = scanner.nextLine();
//
//        System.out.println(s);


//        for(int i=0;i<4;i++) {
//        arr.add(scanner.nextInt());
//        }

//        String s = scanner.nextLine();
//        String[] strarr = s.split(", ");
//        for (String str : strarr) {
//            arr.add(Integer.parseInt(str));
//        }
//        try(FileWriter outFile = new FileWriter("locations.txt")) {
//            outFile.write("this is the end");
//            outFile.e
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (BufferedWriter buffer = new BufferedWriter(new FileWriter("locations.txt"));){
            buffer.write("this is the end", 0,"this is the end".length());
            buffer.flush();
            int offset = "this is the end".length();
            String s = "hello world";
            buffer.write(s,0,s.length());

//            offset+= s.length();
//            s = "this is the end";
//            buffer.write(s, offset, s.length());
//            offset += s.length();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
        for(Integer val : arr) {
            System.out.println(val);
        }
    }
}
