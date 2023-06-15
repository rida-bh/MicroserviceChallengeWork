import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomePageComponent} from "./home/components/home-page/home-page.component";
import {AboutUsPageComponent} from "./about-us/components/about-us-page/about-us-page.component";
import {ContactPageComponent} from "./contact/components/contact-page/contact-page.component";
import {MoviesPageComponent} from "./movies/components/movies-page/movies-page.component";
import {MoviesDetailsComponent} from "./movies/components/movies-details/movies-details.component";


const routes: Routes = [
  {
    path:'',
    component:HomePageComponent,
    children:[
      {
        path:'home-page',
        component:HomePageComponent
      }
    ]
  },
  {
    path:'',
    component:AboutUsPageComponent,
    children:[
      {
        path:'about-us-page',
        component:AboutUsPageComponent
      }
    ]
  },
  {
    path:'',
    component:ContactPageComponent,
    children:[
      {
        path:'contact-page',
        component:ContactPageComponent
      }
    ]
  },
  {
    path:'',
    component:MoviesDetailsComponent,
    children:[
      {
        path:'movie/:id',
        component:MoviesDetailsComponent
      }
    ]
  },
  {
    path:'',
    component:MoviesPageComponent,
    children:[
      {
        path:'movies-page',
        component:MoviesPageComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule { }
