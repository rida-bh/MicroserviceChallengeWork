package com.challenge.movieservice.service;

import com.challenge.movieservice.dto.Movie.MoviePageDTO;

public interface MovieService {
    MoviePageDTO ShowMovies(int page, int size);
    /*MovieSaveDTO AddMovie(MovieSaveDTO hotelSaveDTO);
    MovieSaveDTO UpdateMovie(Long Id, MovieSaveDTO hotelSaveDTO);
    void DeleteMovie(Long Id);
   // List<MovieDTO> listertoutMovies();
    MovieSaveDTO getMovie(Long Id);

   // MoviePageDTO listerMoviesChambrevalable(MovieValableDTO hotelValableDTO,int page, int size);
    //MoviePageDTO SearchMovies(String keyword,int page, int size);

    public MovieDTO listerMovieWithville(Long idMovie);
    public MoviePageDTO listerMoviesByVille(Long Idv,int page, int size);*/
}