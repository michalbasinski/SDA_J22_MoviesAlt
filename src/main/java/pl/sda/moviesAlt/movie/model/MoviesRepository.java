package pl.sda.moviesAlt.movie.model;


import org.springframework.data.jpa.repository.JpaRepository;

interface MoviesRepository extends JpaRepository<Movie, Long> {
}
