import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class SportService {

  constructor(private http: HttpClient) {

  }

  getSports() {

    return this.http.get('http://localhost:8899/sports')
  }
}
