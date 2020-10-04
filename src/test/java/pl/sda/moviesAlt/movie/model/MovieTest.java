package pl.sda.moviesAlt.movie.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MovieTest {

    @LocalServerPort
    private Long localPort;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldGetMovies() {
        //when
        ResponseEntity<List> response
                = restTemplate.getForEntity("http://localhost:" + localPort + "/movies", List.class);

        List movies = response.getBody();
        //then
        assertEquals(new Integer(3), movies.size());
        LinkedHashMap movie = (LinkedHashMap) movies.stream().filter(x -> "Szeregowiec Ryan".equals(((LinkedHashMap) x).get("title"))).findFirst().get();
        assertEquals(1, movie.get("id"));
    }
}
