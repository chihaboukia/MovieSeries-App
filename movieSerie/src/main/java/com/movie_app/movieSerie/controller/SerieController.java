package com.movie_app.movieSerie.controller;

import com.movie_app.movieSerie.entities.Film;
import com.movie_app.movieSerie.entities.Serie;
import com.movie_app.movieSerie.service.FilmService;
import com.movie_app.movieSerie.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/serie")
public class SerieController {
    @Autowired
    SerieService serieService;
    @GetMapping("/Serie")
    @ResponseBody
    public List<Serie> getAllSerie() {
        List<Serie> list = serieService.getAllSerie();
        return list;
    }
    @PostMapping("/AjouterSerie")
    @ResponseBody
    public Serie AjouterSerie(@RequestBody Serie serie) {
        return serieService.AjouterSerie(serie);
    }

}
