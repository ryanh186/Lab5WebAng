import { Component, OnInit } from '@angular/core';
import { destinations} from '../destination-detail/destinations';
import {passengers} from '../passenger/passengers';


@Component({
  selector: 'app-top-bar',
  templateUrl: './top-bar.component.html',
  styleUrls: ['./top-bar.component.css']
})
export class TopBarComponent implements OnInit {

  title: 'Destinations';
  destinationId: any;
  passengerId: any;
  pilotsId: any;
  constructor() { }

  ngOnInit(): void {
  }

}
