import java.net.*;

public class ErrorQuestion2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Connection established!");
        } catch (IOException e) {
            System.out.println("Error in client operation!");
        } catch (Exception ex) {
            System.out.println("General error occurred!");
        }
    }
}