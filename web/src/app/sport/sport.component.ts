import { Component, OnInit } from '@angular/core';
import {SportService} from "./sport.service";

@Component({
  selector: 'app-sport',
  templateUrl: './sport.component.html',
  styleUrls: ['./sport.component.css']
})
export class SportComponent implements OnInit {

  sports;

  constructor(private sportService: SportService) { }

  ngOnInit(): void {

    this.sportService.getSports().subscribe(resp => {
      this.sports = resp;
    })
  }
}
