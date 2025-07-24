import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234)) {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String clientMessage = "Hello from Client!";
            output.println(clientMessage);
            System.out.println("Sent to Server: " + clientMessage);

            String serverResponse = input.readLine();
            System.out.println("Received from Server: " + serverResponse);
            System.out.println("Name: Abhay Raj\nEnrolment No: 00976803122");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
