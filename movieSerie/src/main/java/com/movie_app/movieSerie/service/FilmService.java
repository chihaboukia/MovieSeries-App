package com.movie_app.movieSerie.service;

import com.movie_app.movieSerie.entities.Film;

import java.util.List;

public interface FilmService {
    Film AjouterFilm(Film film);
    List<Film> getAllFilms();
}
