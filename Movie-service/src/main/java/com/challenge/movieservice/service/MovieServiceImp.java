package com.challenge.movieservice.service;

import com.challenge.movieservice.dto.Movie.MovieDTO;
import com.challenge.movieservice.dto.Movie.MoviePageDTO;
import com.challenge.movieservice.entities.Movie;
import com.challenge.movieservice.mappers.MovieMapper;
import com.challenge.movieservice.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class MovieServiceImp implements MovieService{
    private MovieRepository movieRepository;
    private MovieMapper movieMapper;
    @Override
    public MoviePageDTO ShowMovies(int page, int size) {
        Page<Movie> pages = movieRepository.findAll(PageRequest.of(page, size));
        MoviePageDTO moviePageDTO = new MoviePageDTO();
        moviePageDTO.setMovies(movieMapper.getMoviesPages(pages));
        moviePageDTO.setTotalPages(pages.getTotalPages());
        moviePageDTO.setCurrentPage(page);
        moviePageDTO.setPageSize(size);
        return moviePageDTO;
    }

    @Override
    public MovieDTO getMovie(Long id) {
        return movieMapper.fromMovie(movieRepository.findById(id).orElseThrow());
    }
}
