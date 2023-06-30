package com.challenge.movieservice.mappers;

import com.challenge.movieservice.dto.Language.LanguageDTO;
import com.challenge.movieservice.dto.Movie.MovieDTO;
import com.challenge.movieservice.entities.Language;
import com.challenge.movieservice.entities.Movie;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LanguageMapper {
    public MovieDTO fromMovie(Movie movie);
    List<LanguageDTO> getLanguages(List<Language> Languages);
}
