package com.challenge.recommendationservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "Movie-service",url = "localhost:8100")
public interface MoviesProxy {
    @GetMapping("api/movies/all-movies")
    public List<Long> getallmovies();
}
