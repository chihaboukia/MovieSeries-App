package com.movie_app.movieSerie.controller;

import com.movie_app.movieSerie.entities.Film;
import com.movie_app.movieSerie.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/film")
public class FilmController  {
    @Autowired
    FilmService filmService;
    @GetMapping("/Film")
    @ResponseBody
    public List<Film> getAllFilm() {
    List<Film> list = filmService.getAllFilms();
    return list;
    }
    @PostMapping("/AjouterFilm")
    @ResponseBody
    public Film AjouterFilm(@RequestBody Film film) {
        return filmService.AjouterFilm(film);
    }

}

