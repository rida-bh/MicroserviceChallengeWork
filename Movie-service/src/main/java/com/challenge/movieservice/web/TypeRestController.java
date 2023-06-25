package com.challenge.movieservice.web;

import com.challenge.movieservice.dto.Type.TypeDTO;
import com.challenge.movieservice.service.TypeService;
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
public class TypeRestController {
    TypeService typeService;
    @GetMapping("/types")
    public List<TypeDTO> ShowTypes() {
        return typeService.ShowTypes();
    }
}
