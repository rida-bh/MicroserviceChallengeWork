import { Component } from '@angular/core';
import { catchError, map, Observable, of, startWith } from "rxjs";
import { AppDataState, dataStateEnum } from "../../../../../models/state.service";
import { Language, MovieResponse } from "../../../../../models/models.service";
import { MoviesService } from "../../../services/movies.service";

const defaultDisplayCount: number = 5;
const additionalDisplayCount: number = 3;

@Component({
  selector: 'app-language-section',
  templateUrl: './language-section.component.html',
  styleUrls: ['./language-section.component.css']
})
export class LanguageSectionComponent {
  languageInput$: Observable<AppDataState<Language[]>> | null = null;
  readonly DataStateEnum = dataStateEnum;
  displayCount: number = defaultDisplayCount;
  defaultDisplayCount: number = 8;
  additionalDisplayCount: number = 4;


  constructor(private movieService: MoviesService) {}

  ngOnInit(): void {
    this.ShowLanguages();
  }

  private ShowLanguages() {
    this.languageInput$ = this.movieService.getLanguages().pipe(
      map(data => ({ dataState: dataStateEnum.LOADED, data: data })),
      startWith({ dataState: dataStateEnum.LOADING }),
      catchError(err => of({ dataState: dataStateEnum.ERROR, errMessage: err.message }))
    );
  }

  showMore() {
    this.displayCount += additionalDisplayCount;
  }

  showLess() {
    this.displayCount = defaultDisplayCount;
  }
}
