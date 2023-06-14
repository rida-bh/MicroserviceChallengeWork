package com.challenge.movieservice.repository;

import com.challenge.movieservice.entities.Movie;
import com.challenge.movieservice.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,Long> {
}
