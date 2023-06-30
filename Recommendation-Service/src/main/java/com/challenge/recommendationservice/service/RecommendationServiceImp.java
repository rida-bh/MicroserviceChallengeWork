package com.challenge.recommendationservice.service;

import com.challenge.recommendationservice.entity.Recommendation;
import com.challenge.recommendationservice.exception.RateScoreAverageIsNull;
import com.challenge.recommendationservice.proxy.MoviesProxy;
import com.challenge.recommendationservice.proxy.PreferencesProxy;
import com.challenge.recommendationservice.proxy.RatingProxy;
import com.challenge.recommendationservice.repository.RecommendationRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class RecommendationServiceImp implements RecommendationService {
    RecommendationRepository recommendationRepository;
    MoviesProxy moviesProxy;
    PreferencesProxy preferencesProxy;
    RatingProxy ratingProxy;
    @Override
    public List<Recommendation> getRecommendations(int size) {
        updateScoreRecommendation();
        Sort sort = Sort.by(Sort.Direction.DESC, "score");
        if (size <= 0) {
            return recommendationRepository.findAll(sort);
        } else {
            return recommendationRepository.findWithSizeLimit(size,sort);
        }
    }

    @Override
    public Float CalculateScoreOfMovie(Float rateScoreAverage, Float ProportionLikedMovie) {
        return (rateScoreAverage / 5) * 0.5f + ProportionLikedMovie * 0.5f;
    }
    @Override
    public void updateScoreRecommendation() {
        moviesProxy.getallmovies().forEach(idMovie->{
            Float rateScoreAverage = ratingProxy.getRateOfMovie(idMovie);
            Float ProportionLikedMovie = preferencesProxy.getPortionLikedMovie(idMovie);
            Float Score;
            if (rateScoreAverage == null || ProportionLikedMovie == null) {
                throw new NullPointerException("One or more variables is null");
            }else {
                 Score = CalculateScoreOfMovie(rateScoreAverage, ProportionLikedMovie);
            }
            Optional<Recommendation> recommendation = recommendationRepository.findByIdMovie(idMovie);
            Recommendation recommendationValue;
            if (recommendation.isPresent()){
                recommendationValue= recommendation.get();
            }else {
                recommendationValue= new Recommendation();
                recommendationValue.setIdMovie(idMovie);
            }
            recommendationValue.setScore(Score);
            recommendationRepository.save(recommendationValue);
        });

    }
}
