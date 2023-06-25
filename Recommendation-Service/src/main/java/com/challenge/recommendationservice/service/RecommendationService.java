package com.challenge.recommendationservice.service;

import com.challenge.recommendationservice.entity.Recommendation;

import java.util.List;

public interface RecommendationService {
    List<Recommendation> getRecommendations();
    void addRecommendation(Recommendation recommendation);
    void updateRecommendation(Long id,Recommendation recommendation);
    float getScoreMovie(Long id);
}
