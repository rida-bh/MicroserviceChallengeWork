package com.challenge.movieservice.repository;

import com.challenge.movieservice.entities.Language;
import com.challenge.movieservice.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language,Long> {
}
