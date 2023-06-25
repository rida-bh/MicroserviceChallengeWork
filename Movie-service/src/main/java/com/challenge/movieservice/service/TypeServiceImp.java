package com.challenge.movieservice.service;

import com.challenge.movieservice.dto.Language.LanguageDTO;
import com.challenge.movieservice.dto.Type.TypeDTO;
import com.challenge.movieservice.mappers.LanguageMapper;
import com.challenge.movieservice.mappers.TypeMapper;
import com.challenge.movieservice.repository.LanguageRepository;
import com.challenge.movieservice.repository.TypeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class TypeServiceImp implements TypeService{
    TypeMapper typeMapper;
    TypeRepository typeRepository;
    @Override
    public List<TypeDTO> ShowTypes() {
        return typeMapper.getTypes(typeRepository.findAll());
    }
}
