package com.roboautomator.swagger;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTest {

    private static final String BASE_URI = "/api/valid/";

    @LocalServerPort
    private String localServerPort;

    @Test
    void shouldReturnTrueIfCodeIsCorrect() throws IOException, InterruptedException {
        String code = "abc123";

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://localhost:" + localServerPort + BASE_URI + code))
            .GET()
            .build();

        HttpResponse<String> response = HttpClient.newHttpClient()
            .send(request, HttpResponse.BodyHandlers.ofString());

        assertThat(response.body()).isNotEmpty();
        assertThat(response.body()).isEqualTo("true");
    }

    @Test
    void shouldReturnFalseIfTheCodeIsWrong() throws IOException, InterruptedException {
        String code = "wrong";

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://localhost:" + localServerPort + BASE_URI + code))
            .GET()
            .build();

        HttpResponse<String> response = HttpClient.newHttpClient()
            .send(request, HttpResponse.BodyHandlers.ofString());

        assertThat(response.body()).isNotEmpty();
        assertThat(response.body()).isEqualTo("false");
    }
}
