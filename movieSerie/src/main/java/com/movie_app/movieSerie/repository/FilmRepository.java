package com.movie_app.movieSerie.repository;

import com.movie_app.movieSerie.entities.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<Film,Long> {
}
