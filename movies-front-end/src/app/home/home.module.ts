import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';

import { AboutUsPageComponent } from './about-us/components/about-us-page/about-us-page.component';
import { ContactPageComponent } from './contact/components/contact-page/contact-page.component';
import {HomePageComponent} from "./home/components/home-page/home-page.component";
import {
  MovieRecommendationSectionComponent
} from "./home/components/movie-recommendation-section/movie-recommendation-section.component";
import {MoviesModule} from "./movies/movies.module";
import {SharedModule} from "../shared/shared.module";


@NgModule({
  declarations: [
    HomePageComponent,
    AboutUsPageComponent,
    ContactPageComponent,
    MovieRecommendationSectionComponent
  ],
    imports: [
        CommonModule,
        HomeRoutingModule,
        MoviesModule,
        SharedModule
    ]
})
export class HomeModule { }
