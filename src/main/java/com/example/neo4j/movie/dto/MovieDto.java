package com.example.neo4j.movie.dto;

import com.example.neo4j.movie.entity.Movie;
import com.example.neo4j.relationship.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class MovieDto {
    private String title;
    private String tagline;
    private List<Role> actors;
    private List<Role> directors;
    private Integer released;
    private Long votes;

    public MovieDto(Movie movie){
        title = movie.getTitle();
        tagline = movie.getTagline();
        actors = movie.getActors();
        directors = movie.getDirectors();
        released = movie.getReleased();
        votes = movie.getVotes();
    }

    public MovieDto(String title, String tagline){
        this.title = title;
        this.tagline = tagline;
    }
}
