package pl.sda.moviesAlt.movie.model;

import pl.sda.moviesAlt.movie.dto.MovieDto;

class MovieFactory {
    Movie createEntity(MovieDto dto) {
        return new Movie(dto.getId(), dto.getTitle(),dto.getDirector(),dto.getYear());
    }
}
