package com.challenge.movieservice.dto.Movie;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class MoviePageDTO {
    private int currentPage;
    private int totalPages;
    private int pageSize;
    private List<MovieDTO> movies;
}
