import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {HeaderComponent} from "./components/header/header.component";
import { BannerComponent } from './components/banner/banner.component';
import { FooterComponent } from './components/footer/footer.component';
import { PreLoaderComponent } from './components/pre-loader/pre-loader.component';
import {RouterModule} from "@angular/router";



@NgModule({
  declarations: [
    HeaderComponent,
    BannerComponent,
    FooterComponent,
    PreLoaderComponent],
    imports: [
        CommonModule,
        RouterModule
    ],
    exports: [
        HeaderComponent,
        BannerComponent,
        FooterComponent
    ]
})
export class SharedModule { }
