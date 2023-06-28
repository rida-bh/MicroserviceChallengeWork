package com.challenge.recommendationservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Movie-service",url = "localhost:8100")
public interface MoviesProxy {
    @GetMapping("/all-movies")
    public Float getallmovies();
}
