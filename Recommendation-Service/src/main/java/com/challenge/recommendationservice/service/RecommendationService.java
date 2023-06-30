package com.challenge.recommendationservice.service;

import com.challenge.recommendationservice.entity.Recommendation;

import java.util.List;

public interface RecommendationService {
    List<Recommendation> getRecommendations(int size);
    Float CalculateScoreOfMovie(Float rateScoreAverage, Float ProportionLikedMovie);
    void updateScoreRecommendation();
/*    List<Recommendation> getRecommendations(int size);*/
}
