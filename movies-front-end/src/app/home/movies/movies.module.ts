import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AllMoviesComponent } from './components/all-movies/all-movies.component';
import { MoviesDetailsComponent } from './components/movies-details/movies-details.component';

import {FilterBySectionComponent} from "./components/filter-by-section/filter-by-section.component";
import { AllMoviesNavbarComponent } from './components/all-movies-navbar/all-movies-navbar.component';
import {TicketSearchComponent} from "../../shared/components/ticket-search/ticket-search.component";
import {SharedModule} from "../../shared/shared.module";
import { LanguageSectionComponent } from './components/filter-by-section/language-section/language-section.component';
import { ExperienceSectionComponent } from './components/filter-by-section/experience-section/experience-section.component';
import { GenreSectionComponent } from './components/filter-by-section/genre-section/genre-section.component';



@NgModule({
    declarations: [
        AllMoviesComponent,
        MoviesDetailsComponent,
        TicketSearchComponent,
        FilterBySectionComponent,
        AllMoviesNavbarComponent,
        LanguageSectionComponent,
        ExperienceSectionComponent,
        GenreSectionComponent
    ],
  exports: [
    TicketSearchComponent,
    FilterBySectionComponent,
    AllMoviesNavbarComponent,
    AllMoviesComponent
  ],
  imports: [
    CommonModule,
    SharedModule,
  ]
})
export class MoviesModule { }
