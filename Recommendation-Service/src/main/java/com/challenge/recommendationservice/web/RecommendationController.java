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
@RequestMapping("api/recommendation")
@CrossOrigin("*")
public class RecommendationController {
    private RecommendationService recommendationService;
    @GetMapping("/recommendations")
    private List<Recommendation> getRecommendations(@RequestParam(defaultValue = "0") int size){
        return recommendationService.getRecommendations(size);
    }

}
