import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5000)) {
            while(true) {
                new ClientConnection(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientConnection extends Thread {
    Socket clientSocket;
    public ClientConnection(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }
    @Override
    public void run() {
        try {
            System.out.println("Client Connected");
            BufferedReader input = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
            String sin;
            do {
                sin = input.readLine();
                output.println("Responce from server:- " + sin);
            } while (!sin.equals("quit"));
            System.out.println("Client socket " + clientSocket.toString() + " got disconnected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}