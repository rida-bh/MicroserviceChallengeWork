import { Component } from '@angular/core';
import {catchError, map, Observable, of, startWith} from "rxjs";
import {AppDataState, dataStateEnum} from "../../../../models/state.service";
import {Experience, Language, Type} from "../../../../models/models.service";
import {MoviesService} from "../../services/movies.service";

@Component({
  selector: 'app-filter-by-section',
  templateUrl: './filter-by-section.component.html',
  styleUrls: ['./filter-by-section.component.css']
})
export class FilterBySectionComponent {
  languageInput$: Observable<AppDataState<Language[]>> | null = null;
  experienceInput$: Observable<AppDataState<Experience[]>> | null = null;
  typeInput$: Observable<AppDataState<Type[]>> | null = null;
  readonly DataStateEnum = dataStateEnum;
  constructor(private movieService: MoviesService) {}


  ngOnInit(): void {
    this.ShowLanguages();
    this.ShowExperiences();
    this.ShowTypes();
  }

  private ShowLanguages() {
    this.languageInput$ = this.movieService.getLanguages().pipe(
      map(data => ({ dataState: dataStateEnum.LOADED, data: data })),
      startWith({ dataState: dataStateEnum.LOADING }),
      catchError(err => of({ dataState: dataStateEnum.ERROR, errMessage: err.message }))
    );
  }
  private ShowExperiences() {
    this.experienceInput$ = this.movieService.getExperiences().pipe(
      map(data => ({ dataState: dataStateEnum.LOADED, data: data })),
      startWith({ dataState: dataStateEnum.LOADING }),
      catchError(err => of({ dataState: dataStateEnum.ERROR, errMessage: err.message }))
    );

  }
  private ShowTypes() {
    this.typeInput$ = this.movieService.getTypes().pipe(
      map(data => ({ dataState: dataStateEnum.LOADED, data: data })),
      startWith({ dataState: dataStateEnum.LOADING }),
      catchError(err => of({ dataState: dataStateEnum.ERROR, errMessage: err.message }))
    );
  }

  clearAll() {

  }
}
