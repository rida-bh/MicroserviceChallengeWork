package com.challenge.movieservice.mappers;

import com.challenge.movieservice.dto.Language.LanguageDTO;
import com.challenge.movieservice.dto.Movie.MovieDTO;
import com.challenge.movieservice.dto.Type.TypeDTO;
import com.challenge.movieservice.entities.Language;
import com.challenge.movieservice.entities.Movie;
import com.challenge.movieservice.entities.Type;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface TypeMapper {
    public TypeDTO fromType(Type type);
    List<TypeDTO> getTypes(List<Type> Languages);
}
