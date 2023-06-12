import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';

import { AboutUsPageComponent } from './about-us/components/about-us-page/about-us-page.component';
import { ContactPageComponent } from './contact/components/contact-page/contact-page.component';
import {HomePageComponent} from "./home/components/home-page/home-page.component";


@NgModule({
  declarations: [
    HomePageComponent,
    AboutUsPageComponent,
    ContactPageComponent
  ],
  imports: [
    CommonModule,
    HomeRoutingModule
  ]
})
export class HomeModule { }
