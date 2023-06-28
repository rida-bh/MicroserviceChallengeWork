package com.challenge.recommendationservice.service;

import com.challenge.recommendationservice.entity.Recommendation;

import java.util.List;

public interface RecommendationService {
    List<Recommendation> getRecommendations();
    void addRecommendation(Recommendation recommendation);
    void updateRecommendation(Long id,Recommendation recommendation);
    Float getScoreMovie(Long id);

    double CalculateScoreOfMovie(Float rateScoreAverage, Integer numberLikedMovie, Integer TotalLiked);
}
