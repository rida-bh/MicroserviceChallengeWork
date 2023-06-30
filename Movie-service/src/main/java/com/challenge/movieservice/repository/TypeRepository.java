package com.challenge.movieservice.repository;

import com.challenge.movieservice.entities.Movie;
import com.challenge.movieservice.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type,Long> {
}
