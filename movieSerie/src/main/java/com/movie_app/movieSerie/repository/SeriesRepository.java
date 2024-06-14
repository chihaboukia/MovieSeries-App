package com.movie_app.movieSerie.repository;

import com.movie_app.movieSerie.entities.Serie;
import org.springframework.data.repository.CrudRepository;

public interface SeriesRepository extends CrudRepository<Serie, Long> {
}
