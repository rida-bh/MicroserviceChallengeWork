package com.example.ratingservice.repository;

import com.example.ratingservice.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository<Rating,Long> {
}
