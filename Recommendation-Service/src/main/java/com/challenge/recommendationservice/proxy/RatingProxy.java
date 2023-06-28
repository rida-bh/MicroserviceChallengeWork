package com.challenge.recommendationservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "User-service",url = "localhost:8200")
public interface RatingProxy {
    @GetMapping("/movie-rate")
    public Float getRateOfMovie(@RequestParam("id") Long id);
}
