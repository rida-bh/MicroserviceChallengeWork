package com.example.ratingservice;

import com.example.ratingservice.entity.Rating;
import com.example.ratingservice.repository.RateRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class RatingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RatingServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner Start(RateRepository rateRepository){
        return args -> {
            Rating rating =new Rating();
            rating.setIdMovie(1L);
            rating.setIdUser(1L);
            rating.setRatingValue(2.5F);
            rateRepository.save(rating);
            Rating rating2 =new Rating();
            rating2.setIdMovie(1L);
            rating2.setIdUser(2L);
            rating2.setRatingValue(3.5F);
            rateRepository.save(rating2);
            Rating rating4 =new Rating();
            rating4.setIdMovie(1L);
            rating4.setIdUser(3L);
            rating4.setRatingValue(5F);
            rateRepository.save(rating4);


            Rating rating3 =new Rating();
            rating3.setIdMovie(2L);
            rating3.setIdUser(3L);
            rating3.setRatingValue(5F);
            rateRepository.save(rating3);

            Rating rating5 =new Rating();
            rating5.setIdMovie(3L);
            rating5.setIdUser(1L);
            rating5.setRatingValue(2F);
            rateRepository.save(rating5);
        };
    }
}
