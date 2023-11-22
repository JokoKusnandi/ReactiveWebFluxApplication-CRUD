package com.joko.springwebflux.service;

import com.joko.springwebflux.model.Movie;
import com.joko.springwebflux.dao.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MovieService implements IMovieService {

    final
    MovieRepository movieRepo;

    public MovieService(MovieRepository movieRepo) {
        this.movieRepo = movieRepo;
    }

    public void create(Movie e) {
        movieRepo.save(e).subscribe();
    }

    public Flux<Movie> findAll() {
        return movieRepo.findAll();
    }
    public Flux<Movie> findByName(String title) {
        return movieRepo.findByName(title);
    }

    public Mono<Movie> findById(Integer id) {
        return movieRepo.findById(id);
    }

    public Mono<Movie> update(Movie e) {
        return movieRepo.save(e);
    }

    public Mono<Void> delete(Integer id) {
        return movieRepo.deleteById(id);
    }

}
