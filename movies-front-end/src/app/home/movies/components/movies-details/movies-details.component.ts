import { Component } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {MoviesService} from "../../services/movies.service";
import {catchError, map, Observable, of, startWith} from "rxjs";
import {AppDataState, dataStateEnum} from "../../../../models/state.service";
import {Movie} from "../../../../models/models.service";

@Component({
  selector: 'app-movies-details',
  templateUrl: './movies-details.component.html',
  styleUrls: ['./movies-details.component.css']
})
export class MoviesDetailsComponent {
  movieInput$ :Observable <AppDataState<Movie>>|null =null;
  readonly DataStateEnum=dataStateEnum;
  idmovie?:number;

  constructor(private route:ActivatedRoute,
              private moviesService:MoviesService) {
  }
  ngOnInit() {
  this.idmovie=Number(this.route.snapshot.paramMap.get('id'));
    console.log(this.route.snapshot.paramMap.get("id"));
  this.getMovie(this.idmovie);

  }

  private getMovie(idmovie: number) {
    this.movieInput$=this.moviesService.getMovie(idmovie).pipe(
      map(data=>({dataState: dataStateEnum.LOADED ,data:data})),
      startWith({dataState: dataStateEnum.LOADING }),
      catchError(err=>of({dataState: dataStateEnum.ERROR , errMessage:err.message}))
    );
  }
}
