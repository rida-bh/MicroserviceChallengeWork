import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from "./components/login/login.component";
import {SignupComponent} from "./components/signup/signup.component";

const routes: Routes = [
  {
    path:'',
    component:LoginComponent,
    children:[
      {
        path:'login',
        component:LoginComponent
      }
    ]
  },
  {
    path:'',
    component:SignupComponent,
    children:[
      {
        path:'signup',
        component:SignupComponent
      }
    ]
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AuthRoutingModule { }
