package com.joko.springwebflux.dao;

import com.joko.springwebflux.model.Movie;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface MovieRepository extends ReactiveMongoRepository<Movie, Integer> {

    @Query("{ 'name': ?0 }")
    Flux<Movie> findByName(final String title);

}
