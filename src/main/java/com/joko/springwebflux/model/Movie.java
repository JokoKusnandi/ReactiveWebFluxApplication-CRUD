package com.joko.springwebflux.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Movie {

    @Id
    int id;
    String plot;
    List<String> genres;
    String title;

    public Movie() {
    }

    public Movie(int id, String plot, List<String> genres, String title) {
        this.id = id;
        this.plot = plot;
        this.genres = genres;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", plot='" + plot + '\'' +
                ", genres=" + genres +
                ", title='" + title + '\'' +
                '}';
    }
}

