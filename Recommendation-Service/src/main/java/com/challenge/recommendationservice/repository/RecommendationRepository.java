package com.challenge.recommendationservice.repository;

import com.challenge.recommendationservice.entity.Recommendation;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RecommendationRepository extends JpaRepository<Recommendation,Long> {

    Optional<Recommendation> findByIdMovie(Long idMovie);

    @Query("SELECT r FROM Recommendation r")
    List<Recommendation> findWithSizeLimit(int size, Sort sort);

}
