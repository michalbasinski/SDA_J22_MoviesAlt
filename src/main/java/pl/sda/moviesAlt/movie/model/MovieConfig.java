package pl.sda.moviesAlt.movie.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class MovieConfig {

    @Bean
    MovieFacade getMovieFacade(MovieFactory factory, MoviesRepository repository) {
        return new MovieFacade(repository, factory);
    }

    @Bean
    MovieFactory getMovieFactory() {
        return new MovieFactory();
    }
}
