import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
//        FileWriter outFile = null;
//        outFile = new FileWriter("locations.txt");
//        outFile.write("helloworld\n");
//        outFile.write("this is the end\n");
//        outFile.write("hold ur breath and count to ten\n");
//        outFile.close();
        FileReader inFile = new FileReader("locations.txt");
        Scanner scanner = new Scanner(inFile);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (s.equals("")) {
                System.out.println("got an empty line");
            } else {
                System.out.println(s);
            }
        }
        scanner.close();
    }
}
