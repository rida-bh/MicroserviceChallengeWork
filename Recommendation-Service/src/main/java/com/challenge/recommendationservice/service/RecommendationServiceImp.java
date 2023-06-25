package com.challenge.recommendationservice.service;

import com.challenge.recommendationservice.entity.Recommendation;
import com.challenge.recommendationservice.repository.RecommendationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class RecommendationServiceImp implements RecommendationService {
    RecommendationRepository recommendationRepository;
    @Override
    public List<Recommendation> getRecommendations() {
        return recommendationRepository.findAll();
    }

    @Override
    public void addRecommendation(Recommendation rating) {
        recommendationRepository.save(rating);
    }

    @Override
    public void updateRecommendation(Long id,Recommendation recommendation) {
        Recommendation recommendation1=recommendationRepository.findById(id).orElseThrow();
        recommendation1.setScore(recommendation.getScore());
        recommendationRepository.save(recommendation1);
    }

    @Override
    public float getScoreMovie(Long id) {
        return  recommendationRepository.getAverageRateMovie(id);
    }
}
