import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 5000)) {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            String sin;
            do {
                sin = scanner.nextLine();
                output.println(sin);
                String responce = input.readLine();
                System.out.println(responce);
            } while (!sin.equals("quit"));
            System.out.println("quitted from server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}