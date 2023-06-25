package com.challenge.movieservice.service;

import com.challenge.movieservice.dto.Language.LanguageDTO;
import com.challenge.movieservice.dto.Type.TypeDTO;

import java.util.List;

public interface TypeService {
    List<TypeDTO> ShowTypes();
}
