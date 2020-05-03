import { Component, OnInit } from '@angular/core';
import { destinations} from '../destination-detail/destinations';

@Component({
  selector: 'app-top-bar',
  templateUrl: './top-bar.component.html',
  styleUrls: ['./top-bar.component.css']
})
export class TopBarComponent implements OnInit {
  destinations = destinations;
  title: 'Destinations';
  destinationId: any;
  constructor() { }

  ngOnInit(): void {
  }

}
