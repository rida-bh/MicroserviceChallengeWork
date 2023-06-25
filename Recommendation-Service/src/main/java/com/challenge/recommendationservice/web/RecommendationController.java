package com.challenge.recommendationservice.web;

import com.challenge.recommendationservice.entity.Recommendation;
import com.challenge.recommendationservice.service.RecommendationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@Slf4j
@CrossOrigin("*")
public class RecommendationController {
    private RecommendationService recommendationService;
    @GetMapping("/recommendations")
    private List<Recommendation> getRatings(){
        return recommendationService.getRecommendations();
    }
    @PostMapping ("/rate")
    private void Rate(@RequestBody Recommendation rating){
        recommendationService.addRecommendation(rating);
    }
    @PostMapping ("/rating")
    private void Rate(@RequestBody Recommendation rating,@RequestParam("id") Long id){
        recommendationService.updateRecommendation(id,rating);
    }
    @GetMapping ("/movie-rate")
    private float getRateOfMovie(@RequestParam("id") Long id){
        return recommendationService.getScoreMovie(id);
    }
}
