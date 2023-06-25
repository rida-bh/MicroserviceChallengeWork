package com.challenge.recommendationservice.repository;

import com.challenge.recommendationservice.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RecommendationRepository extends JpaRepository<Recommendation,Long> {
    @Query("SELECT AVG(r.score) FROM Recommendation r WHERE r.idMovie = :idMovie")
    float getAverageRateMovie(@Param("idMovie") Long idMovie);
}
