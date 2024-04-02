package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class UserApiHandler {

    private final String userURL = "https://jsonplaceholder.typicode.com/users";
    private final HttpClient client = HttpClient.newHttpClient();

    public HttpResponse<String> getUserDate(int userId) {
        try {
            HttpRequest request = HttpRequest.newBuilder(new URI(userURL + "/")).GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return response;
        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public HttpResponse<String> postUserData(String userJSON) {
        try {
            HttpRequest request = HttpRequest.newBuilder(new URI(userURL))
                    .POST(HttpRequest.BodyPublishers.ofString(userJSON))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return response;
        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
