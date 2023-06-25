package com.challenge.movieservice.mappers;

import com.challenge.movieservice.dto.Experience.ExperienceDTO;
import com.challenge.movieservice.entities.Experience;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface ExperienceMapper {
    public ExperienceDTO fromExperience(Experience type);
    List<ExperienceDTO> getExperiences(List<Experience> Languages);
}
