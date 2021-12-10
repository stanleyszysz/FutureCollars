package fc.networking.task1;

import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WebSiteWget {
    public static void main(String[] args) throws Exception {

        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest httpRequest =
                HttpRequest.newBuilder(new URI(args[0]))
                        .GET()
                        .build();

        HttpResponse<String> httpResponse = httpClient
                .send(httpRequest, HttpResponse.BodyHandlers.ofString());

        int statusCode = httpResponse.statusCode();

        System.out.println(statusCode);

        String body = httpResponse.body();
        FileWriter fileWriter = new FileWriter(args[1]);
        fileWriter.write(body);
        fileWriter.close();
    }

}