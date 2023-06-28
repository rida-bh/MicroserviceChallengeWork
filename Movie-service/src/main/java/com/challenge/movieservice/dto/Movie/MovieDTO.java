package com.challenge.movieservice.dto.Movie;

import com.challenge.movieservice.dto.Experience.ExperienceDTO;
import com.challenge.movieservice.dto.Language.LanguageDTO;
import com.challenge.movieservice.dto.Type.TypeDTO;
import com.challenge.movieservice.entities.Language;
import lombok.Data;

import java.util.Date;


@Data
public class MovieDTO {
    private Long idMovie;
    private String title;
    private String description;
    private String posterUrl;
    private int durationInMin;
    private Date releaseDate;
    private String country;
    private ExperienceDTO experience;
    private LanguageDTO language;
    private TypeDTO type;
    private Float ratingValue;
}
