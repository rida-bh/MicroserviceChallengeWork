package com.example.ratingservice.service;

import com.example.ratingservice.entity.Rating;

import java.util.List;

public interface RateService {
    List<Rating> getRates();
    void addRating(Rating rating);
    void updateRating(Long id,Rating rating);
    float getAverageRateMovie(Long id);
}
