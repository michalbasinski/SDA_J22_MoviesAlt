package pl.sda.moviesAlt.movie.dto;

import lombok.Value;

@Value
public class MovieDto {
    private Long id;
    private String title;
    private String director;
    private Integer year;
}
