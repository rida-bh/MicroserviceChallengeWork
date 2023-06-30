package com.challenge.recommendationservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*@FeignClient(name = "Rate-service",url = "localhost:8200")*/
@FeignClient(name = "Rate-service",url = "localhost:8200")
public interface RatingProxy {
    @GetMapping("api/rate/movie-rate")
    public Float getRateOfMovie(@RequestParam("id") Long id);
}
