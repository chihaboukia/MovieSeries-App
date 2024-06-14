package com.movie_app.movieSerie.service;

import com.movie_app.movieSerie.entities.Film;
import com.movie_app.movieSerie.entities.Serie;

import java.util.List;

public interface SerieService {
        Serie AjouterSerie(Serie serie);
    List<Serie> getAllSerie();
}
