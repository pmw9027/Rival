import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FriendComponent } from './friend/friend.component';
import {SportComponent} from "./sport/sport.component";

const routes: Routes = [
  { path: 'friends', component: FriendComponent }
  , { path: 'sports', component: SportComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
