import { Component } from '@angular/core';
import {catchError, map, Observable, of, startWith} from "rxjs";
import {AppDataState, dataStateEnum} from "../../../../models/state.service";
import {MovieResponse} from "../../../../models/models.service";
import {MoviesService} from "../../services/movies.service";

@Component({
  selector: 'app-all-movies',
  templateUrl: './all-movies.component.html',
  styleUrls: ['./all-movies.component.css']
})
export class AllMoviesComponent {
  moviesInput$ :Observable <AppDataState<MovieResponse>>|null =null;
  readonly DataStateEnum=dataStateEnum;
  currentPage:number =0;
  pageSize:number =9;
  constructor(private moviesService:MoviesService) {
  }
  ngOnInit():void{
    this.ShowMovies(this.currentPage,this.pageSize);
  }

  private ShowMovies(currentPage: number, pageSize: number) {
    this.moviesInput$=this.moviesService.getMovies(currentPage,pageSize).pipe(
      map(data=>({dataState: dataStateEnum.LOADED ,data:data})),
      startWith({dataState: dataStateEnum.LOADING }),
      catchError(err=>of({dataState: dataStateEnum.ERROR , errMessage:err.message}))
    );
  }
}
