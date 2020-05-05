import { Component, OnInit } from '@angular/core';
import { airplanes } from './airplanes';
import {Destinations} from '../destination-form/destinations';

@Component({
  selector: 'app-list-airplanes',
  templateUrl: './list-airplanes.component.html',
  styleUrls: ['./list-airplanes.component.css']
})
export class ListAirplanesComponent implements OnInit {
  airplanes = airplanes;
  destinations = Destinations;
  constructor() { }

  ngOnInit(): void {
  }

}
