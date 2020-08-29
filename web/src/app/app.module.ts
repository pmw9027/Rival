import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FriendComponent } from './friend/friend.component';

import {HttpClientJsonpModule, HttpClientModule} from '@angular/common/http';
import { PlayerComponent } from './player/player.component';
import { GameComponent } from './game/game.component';
import { SportComponent } from './sport/sport.component';


@NgModule({
  declarations: [
    AppComponent,
    FriendComponent,
    PlayerComponent,
    GameComponent,
    SportComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,

    HttpClientJsonpModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
