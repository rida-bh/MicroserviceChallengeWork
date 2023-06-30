package com.challenge.movieservice.service;


import com.challenge.movieservice.dto.Experience.ExperienceDTO;
import com.challenge.movieservice.mappers.ExperienceMapper;
import com.challenge.movieservice.repository.ExperienceRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ExperienceServiceImp implements ExperienceService{
    ExperienceMapper experienceMapper;
    ExperienceRepository experienceRepository;
    @Override
    public List<ExperienceDTO> ShowExperiences() {
        return experienceMapper.getExperiences(experienceRepository.findAll());
    }
}
