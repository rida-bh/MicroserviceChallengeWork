package com.challenge.movieservice.service;

import com.challenge.movieservice.dto.Movie.MoviePageDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class MovieServiceImp implements MovieService{
    @Override
    public MoviePageDTO ShowMovies(int page, int size) {
        return null;
    }
}