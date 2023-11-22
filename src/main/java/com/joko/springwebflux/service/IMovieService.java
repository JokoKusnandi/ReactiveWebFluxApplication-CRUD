package com.joko.springwebflux.service;

import com.joko.springwebflux.model.Movie;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IMovieService {

    void create(Movie e);
    Flux<Movie> findAll();

    Flux<Movie> findByName(String title);

    Mono<Movie> findById(Integer id);

    Mono<Movie> update(Movie e);

    Mono<Void> delete(Integer id);
}
