import { Component, OnInit } from '@angular/core';
import {Destinations} from '../destination-form/destinations';
import {passengers} from '../passenger/passengers';


@Component({
  selector: 'app-top-bar',
  templateUrl: './top-bar.component.html',
  styleUrls: ['./top-bar.component.css']
})
export class TopBarComponent implements OnInit {
  destination = Destinations;
  passengers = passengers;
  title: 'Destinations';

  constructor() { }

  ngOnInit(): void {
  }

}
