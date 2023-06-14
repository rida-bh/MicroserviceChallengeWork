package com.challenge.movieservice.dto.Movie;

import com.challenge.movieservice.entities.Movie;
import lombok.Data;

import java.util.List;

@Data
public class MoviePageDTO {
    private int currentPage;
    private int totalPages;
    private int pageSize;
    private List<Movie> movies;
}
