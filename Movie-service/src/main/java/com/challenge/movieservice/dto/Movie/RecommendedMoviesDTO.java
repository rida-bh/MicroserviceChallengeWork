package com.challenge.movieservice.dto.Movie;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class RecommendedMoviesDTO {
    private Long idRecommendation;
    private Float score ;
    private Long idMovie;
}
