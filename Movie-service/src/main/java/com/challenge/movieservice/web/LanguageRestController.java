package com.challenge.movieservice.web;

import com.challenge.movieservice.dto.Language.LanguageDTO;
import com.challenge.movieservice.service.LanguageService;
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
public class LanguageRestController {
    LanguageService languageService;
    @GetMapping("/languages")
    public List<LanguageDTO> ShowLanguages() {
        return languageService.ShowLanguages();
    }
}
