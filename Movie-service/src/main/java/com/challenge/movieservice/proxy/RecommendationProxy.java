package com.challenge.movieservice.proxy;

import com.challenge.movieservice.dto.Movie.RecommendedMoviesDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "Recommendation-service",url = "localhost:8300")
public interface RecommendationProxy {
    @GetMapping("api/recommendation/recommendations")
     List<RecommendedMoviesDTO> getRecommendations(@RequestParam(defaultValue = "0") int size);
}
