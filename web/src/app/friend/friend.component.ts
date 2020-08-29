import { Component, OnInit } from '@angular/core';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {FriendService} from "./friend.service";



@Component({
  selector: 'app-friend',
  templateUrl: './friend.component.html',
  styleUrls: ['./friend.component.css']
})

@Injectable()
export class FriendComponent implements OnInit {

  games;

  constructor(
    private friendService: FriendService,

  ) {

  }

  ngOnInit(): void {

    let t = this.friendService.getFriend();
    t.subscribe(resp => {
      console.log(resp);

      this.games = resp;

    });

    this.showConfig();

  }
  config: Config;

  showConfig() {
    this.friendService.getConfig()
      .subscribe((data: Config) => this.config = { ...data });
  }
}

export interface Config {
}
