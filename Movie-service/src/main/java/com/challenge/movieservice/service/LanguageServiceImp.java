package com.challenge.movieservice.service;

import com.challenge.movieservice.dto.Language.LanguageDTO;
import com.challenge.movieservice.dto.Movie.MoviePageDTO;
import com.challenge.movieservice.entities.Language;
import com.challenge.movieservice.mappers.LanguageMapper;
import com.challenge.movieservice.repository.LanguageRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class LanguageServiceImp implements LanguageService{
    LanguageMapper languageMapper;
    LanguageRepository languageRepository;
    @Override
    public List<LanguageDTO> ShowLanguages() {
        return languageMapper.getLanguages(languageRepository.findAll());
    }
}
