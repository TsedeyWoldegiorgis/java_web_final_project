package com.example.java_web_final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String genre;
    private int runtime; // minutes

    public Movie(Long id, String title, String genre, int runtime) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.runtime = runtime;
    }

    public Movie() {


    }
     // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return runtime == movie.runtime && Objects.equals(id, movie.id) && Objects.equals(title, movie.title) && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, genre, runtime);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", runtime=" + runtime +
                '}';
    }
}



