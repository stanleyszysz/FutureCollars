package fc.networking.task2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 9999);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        String message;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text.");
        message = scanner.nextLine();
        objectOutputStream.writeObject(message);
        String messageFromServer = (String) objectInputStream.readObject();
        System.out.println(messageFromServer);
    }
}