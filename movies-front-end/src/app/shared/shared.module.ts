import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {HeaderComponent} from "./components/header/header.component";
import { BannerComponent } from './components/banner/banner.component';
import { FooterComponent } from './components/footer/footer.component';
import { PreLoaderComponent } from './components/pre-loader/pre-loader.component';



@NgModule({
  declarations: [
    HeaderComponent,
    BannerComponent,
    FooterComponent,
    PreLoaderComponent],
  imports: [
    CommonModule
  ],
    exports: [
        HeaderComponent,
        BannerComponent,
        FooterComponent
    ]
})
export class SharedModule { }
