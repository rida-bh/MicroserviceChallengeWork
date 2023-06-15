package com.challenge.movieservice.web;

import com.challenge.movieservice.dto.Movie.MovieDTO;
import com.challenge.movieservice.dto.Movie.MoviePageDTO;
import com.challenge.movieservice.service.MovieService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@Slf4j
public class MovieRestController {
    private MovieService movieService;

    @GetMapping("/movies")
    public MoviePageDTO ShowMovies(@RequestParam(name = "page", defaultValue = "0") int page,
                                   @RequestParam(name = "size", defaultValue = "9") int size) {
        return movieService.ShowMovies(page, size);
    }
    @GetMapping("/movie/{id}")
    public MovieDTO getMovie(@PathVariable Long id) {
        return movieService.getMovie(id);
    }
}
