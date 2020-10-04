package pl.sda.moviesAlt.movie.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.sda.moviesAlt.movie.dto.MovieDto;

import javax.persistence.*;

@Entity
@Table(name = "Movies")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String director;
    private Integer year;

    MovieDto toDto() {
        return new MovieDto(id, title, director, year);
    }
}
