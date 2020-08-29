import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from "rxjs";
import { catchError, retry } from 'rxjs/operators'
import {Config} from "./friend.component";

@Injectable({
  providedIn: 'root'
})
export class FriendService {

  constructor(private http: HttpClient) {
  }

  configUrl = 'assets/config.json';

  getConfig() {
    return this.http.get<Config>(this.configUrl);
  }

  getFriend() {
    return this.http.get('http://localhost:8899/games');
  }

  getFriends() {
    const options = {
      responseType: 'text' as const,
    };
    return this.http.jsonp('http://127.0.0.1:8899/game', 'callback').pipe(
    );
  }
  createFriend(config: Config) {
    const options = {
      responseType: 'text' as const,
    };
    return this.http.post<Config>('http://127.0.0.1:8899/game', config);
  }
}

