package com.challenge.movieservice.service;

import com.challenge.movieservice.dto.Movie.MovieDTO;
import com.challenge.movieservice.dto.Movie.MoviePageDTO;
import com.challenge.movieservice.entities.Movie;
import com.challenge.movieservice.mappers.MovieMapper;
import com.challenge.movieservice.proxy.MovieProxy;
import com.challenge.movieservice.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class MovieServiceImp implements MovieService{
    private MovieRepository movieRepository;
    private MovieMapper movieMapper;
    private MovieProxy movieProxy;
    @Override
    public MoviePageDTO ShowMovies(int page, int size) {
        Page<Movie> pages = movieRepository.findAll(PageRequest.of(page, size));
        MoviePageDTO moviePageDTO = new MoviePageDTO();
        List<MovieDTO> movieDTOS=movieMapper.getMoviesPages(pages);
        movieDTOS.forEach(movieDTO -> movieDTO.setRatingValue(movieProxy.getRateOfMovie(movieDTO.getIdMovie())));
        moviePageDTO.setMovies(movieDTOS);
        moviePageDTO.setTotalPages(pages.getTotalPages());
        moviePageDTO.setCurrentPage(page);
        moviePageDTO.setPageSize(size);
        return moviePageDTO;
    }

    @Override
    public MovieDTO getMovie(Long id) {
        MovieDTO movieDTO = movieMapper.fromMovie(movieRepository.findById(id).orElseThrow());
        movieDTO.setRatingValue(movieProxy.getRateOfMovie(id));
        return movieDTO;
    }

    @Override
    public List<MovieDTO> ShowMoviesWithoutPageable() {
        return movieMapper.fromMoviesToMoviesDto(movieRepository.findAll());
    }

}
