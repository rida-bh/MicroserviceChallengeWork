package com.example.ratingservice.repository;

import com.example.ratingservice.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RateRepository extends JpaRepository<Rating,Long> {
    @Query("SELECT AVG(r.ratingValue) FROM Rating r WHERE r.idMovie = :idMovie")
    Float getAverageRateMovie(@Param("idMovie") Long idMovie);
}
