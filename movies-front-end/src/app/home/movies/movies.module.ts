import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AllMoviesComponent } from './components/all-movies/all-movies.component';
import { MoviesDetailsComponent } from './components/movies-details/movies-details.component';
import { TicketSearchComponent } from './components/ticket-search/ticket-search.component';
import {FilterBySectionComponent} from "./components/filter-by-section/filter-by-section.component";
import { AllMoviesNavbarComponent } from './components/all-movies-navbar/all-movies-navbar.component';



@NgModule({
    declarations: [
        AllMoviesComponent,
        MoviesDetailsComponent,
        TicketSearchComponent,
        FilterBySectionComponent,
        AllMoviesNavbarComponent
    ],
  exports: [
    TicketSearchComponent,
    FilterBySectionComponent,
    AllMoviesNavbarComponent,
    AllMoviesComponent
  ],
    imports: [
        CommonModule
    ]
})
export class MoviesModule { }
