package com.movie_app.movieSerie.service;

import com.movie_app.movieSerie.entities.Serie;
import com.movie_app.movieSerie.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieServiceImpl implements SerieService{
    @Autowired
    SeriesRepository serieRepository;
    @Override
    public Serie AjouterSerie(Serie serie) {
        serieRepository.save(serie);
        return serie;
    }

    @Override
    public List<Serie> getAllSerie() {
        return (List<Serie>) serieRepository.findAll();
    }
}
