package com.challenge.movieservice.mappers;

import com.challenge.movieservice.dto.Movie.MovieDTO;
import com.challenge.movieservice.entities.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    public MovieDTO fromMovie(Movie movie);
    public List<MovieDTO> getMoviesPages(Page<Movie> movies);
}
