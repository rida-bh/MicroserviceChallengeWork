import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {SharedModule} from "./shared/shared.module";
import { HomeLayoutComponent } from './layouts/home-layout/home-layout.component';
import { AuthLayoutComponent } from './layouts/auth-layout/auth-layout.component';
import { MoviesPageComponent } from './home/movies/components/movies-page/movies-page.component';
import {MoviesModule} from "./home/movies/movies.module";
import { MoviesSectionComponent } from './home/movies/components/movies-section/movies-section.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeLayoutComponent,
    AuthLayoutComponent,
    MoviesPageComponent,
    MoviesSectionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SharedModule,
    MoviesModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
