import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {MovieResponse} from "../../../models/models.service";
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
}
