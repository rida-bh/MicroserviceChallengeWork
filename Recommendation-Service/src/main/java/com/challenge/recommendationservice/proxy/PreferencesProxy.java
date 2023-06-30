package com.challenge.recommendationservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "preferences-service",url = "localhost:8400")
public interface PreferencesProxy {
    @GetMapping("api/user/propotion-liked-movie")
    public Float getPortionLikedMovie(@RequestParam("id") Long id);
}
