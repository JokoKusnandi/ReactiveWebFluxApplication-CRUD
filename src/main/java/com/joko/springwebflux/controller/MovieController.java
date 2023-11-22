package com.joko.springwebflux.controller;

import com.joko.springwebflux.model.Movie;
import com.joko.springwebflux.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping(path = "/add", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Movie movie) {
        movieService.create(movie);
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public ResponseEntity<Mono<Movie>> findById(@PathVariable("id") Integer id) {
        Mono<Movie> movie = movieService.findById(id);
        return new ResponseEntity<Mono<Movie>>(movie, HttpStatus.OK);
    }

    @GetMapping( "/getByTitle")
    public Flux<Movie> findByName(@RequestParam("title") String title) {
        return movieService.findByName(title);
    }

    @GetMapping("/")
    public Flux<Movie> findAll() {
        Flux<Movie> movies = movieService.findAll();
        return movies;
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Movie> update(@RequestBody Movie movie) {
        return movieService.update(movie);
    }

    @DeleteMapping( "/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id) {
        movieService.delete(id).subscribe();
    }
}