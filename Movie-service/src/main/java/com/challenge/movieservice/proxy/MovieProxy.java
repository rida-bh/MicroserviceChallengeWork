package com.challenge.movieservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(name = "rate-service",url = "localhost:8200")
public interface MovieProxy {
    @GetMapping("api/rate/movie-rate")
    public Float getRateOfMovie(@RequestParam("id") Long id);
}
