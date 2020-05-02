import { Component, OnInit } from '@angular/core';
import { airplanes } from '../airplanes';

@Component({
  selector: 'app-list-airplanes',
  templateUrl: './list-airplanes.component.html',
  styleUrls: ['./list-airplanes.component.css']
})
export class ListAirplanesComponent implements OnInit {
  airplanes = airplanes;
  constructor() { }

  ngOnInit(): void {
  }

}
