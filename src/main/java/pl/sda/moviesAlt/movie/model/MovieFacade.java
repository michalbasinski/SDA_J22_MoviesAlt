package pl.sda.moviesAlt.movie.model;

import lombok.AllArgsConstructor;
import pl.sda.moviesAlt.movie.dto.MovieDto;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class MovieFacade {

    private MoviesRepository repository;
    private MovieFactory factory;

    public List<MovieDto> getMovies() {
        List<Movie> movies = repository.findAll();
        return movies.stream().map(x -> x.toDto()).collect(Collectors.toList());
    }

    public MovieDto saveMovie(MovieDto movieDto) {
        Movie movieToSave = factory.createEntity(movieDto);
        return repository.save(movieToSave).toDto();
    }
}
