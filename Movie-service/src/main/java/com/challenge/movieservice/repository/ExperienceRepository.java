package com.challenge.movieservice.repository;

import com.challenge.movieservice.entities.Experience;
import com.challenge.movieservice.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience,Long> {
}
