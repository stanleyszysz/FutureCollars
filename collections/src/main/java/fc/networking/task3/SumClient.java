package fc.networking.task3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 9999);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter space separated numbers.");
        String line = scanner.nextLine();
        List<Integer> list = Arrays.stream(line.split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        objectOutputStream.writeObject(list);
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        int messageFromServer = (int) objectInputStream.readObject();
        System.out.println(messageFromServer);
    }
}
