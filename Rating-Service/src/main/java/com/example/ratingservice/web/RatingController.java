package com.example.ratingservice.web;

import com.example.ratingservice.entity.Rating;
import com.example.ratingservice.service.RateService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@Slf4j
@CrossOrigin("*")
public class RatingController {
    private RateService rateService;
    @GetMapping("/ratings")
    private List<Rating> getRatings(){
        return rateService.getRates();
    }
    @PostMapping ("/rate")
    private void Rate(@RequestBody Rating rating){
        rateService.addRating(rating);
    }
    @PostMapping ("/rating")
    private void Rate(@RequestBody Rating rating,@RequestParam("id") Long id){
        rateService.updateRating(id,rating);
    }
    @GetMapping ("/movie-rate")
    private Float getRateOfMovie(@RequestParam("id") Long id){
        return rateService.getAverageRateMovie(id);
    }
}
