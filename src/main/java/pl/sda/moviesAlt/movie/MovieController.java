package pl.sda.moviesAlt.movie;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.moviesAlt.movie.dto.MovieDto;
import pl.sda.moviesAlt.movie.model.MovieFacade;

import java.util.List;

@RestController
@AllArgsConstructor
class MovieController {

    private MovieFacade facade;

    @GetMapping("/movies")
    List<MovieDto> getMovies() {
        return facade.getMovies();
    }

    @PostMapping("/movies")
    MovieDto save(@RequestBody MovieDto dto) {
        return facade.saveMovie(dto);
    }

}
