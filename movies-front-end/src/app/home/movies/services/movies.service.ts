import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Experience, Language, Movie, MovieResponse, Type} from "../../../models/models.service";
import {environment} from "../../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class MoviesService {

  constructor(private http : HttpClient) { }
  getMovies(currentPage: number, pageSize: number) {
    let host =environment.host;
    return this.http.get<MovieResponse>(host+"/movies?page="+currentPage+"&size="+pageSize);
  }
  getLanguages() {
    let host =environment.host;
    return this.http.get<Language[]>(host+"/languages");
  }
  getExperiences() {
    let host =environment.host;
    return this.http.get<Experience[]>(host+"/experiences");
  }
  getTypes() {
    let host =environment.host;
    return this.http.get<Type[]>(host+"/types");
  }

  getMovie(idmovie: number) {
    let host =environment.host;
    return this.http.get<Movie>(host+"/movie/"+idmovie);
  }
}
