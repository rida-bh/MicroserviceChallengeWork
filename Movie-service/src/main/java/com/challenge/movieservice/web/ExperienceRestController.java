package com.challenge.movieservice.web;

import com.challenge.movieservice.dto.Experience.ExperienceDTO;
import com.challenge.movieservice.service.ExperienceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@Slf4j
public class ExperienceRestController {
    ExperienceService experienceService;
    @GetMapping("/experiences")
    public List<ExperienceDTO> ShowExperiences() {
        return experienceService.ShowExperiences();
    }
}
