package com.movie_app.movieSerie.service;

import com.movie_app.movieSerie.entities.Film;
import com.movie_app.movieSerie.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
@Autowired
FilmRepository filmRepository;
    @Override
    public Film AjouterFilm(Film film) {
        filmRepository.save(film);
        return film;
    }

    @Override
    public List<Film> getAllFilms() {
        return(List<Film>) filmRepository.findAll();
    }
}
