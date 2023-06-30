import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AllMoviesComponent } from './components/all-movies/all-movies.component';
import { MoviesDetailsComponent } from './components/movies-details/movies-details.component';

import {FilterBySectionComponent} from "./components/filter-by-section/filter-by-section.component";
import { AllMoviesNavbarComponent } from './components/all-movies-navbar/all-movies-navbar.component';
import {TicketSearchComponent} from "../../shared/components/ticket-search/ticket-search.component";
import {SharedModule} from "../../shared/shared.module";
import {FormsModule} from "@angular/forms";
import {RouterModule} from "@angular/router";



@NgModule({
    declarations: [
        AllMoviesComponent,
        MoviesDetailsComponent,
        TicketSearchComponent,
        FilterBySectionComponent,
        AllMoviesNavbarComponent,
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
    FormsModule,
    RouterModule,
  ]
})
export class MoviesModule { }
