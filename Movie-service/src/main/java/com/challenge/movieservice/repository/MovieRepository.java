package com.challenge.movieservice.repository;

import com.challenge.movieservice.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    @Query("SELECT m.idMovie FROM Movie m")
    List<Long> getAllIds();
}
