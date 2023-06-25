package com.example.ratingservice.service;

import com.example.ratingservice.entity.Rating;
import com.example.ratingservice.repository.RateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class RateServiceImp implements RateService{
    RateRepository rateRepository;
    @Override
    public List<Rating> getRates() {
        return rateRepository.findAll();
    }

    @Override
    public void addRating(Rating rating) {
        rateRepository.save(rating);
    }

    @Override
    public void updateRating(Long id,Rating rating) {
        Rating rating1=rateRepository.findById(id).orElseThrow();
        rating1.setRatingValue(rating.getRatingValue());
        rateRepository.save(rating1);
    }

    @Override
    public float getAverageRateMovie(Long id) {
        return  rateRepository.getAverageRateMovie(id);
    }
}
