import { Component, OnInit } from '@angular/core';
import {Destinations} from '../destination-form/destinations';
import {DestinationServiceService} from '../destination-service.service';

@Component({
  selector: 'app-destination-detail',
  templateUrl: './destination-detail.component.html',
  styleUrls: ['./destination-detail.component.css']
})
export class DestinationDetailComponent implements OnInit {
  destinations: any;

  constructor(private service: DestinationServiceService) { }

  ngOnInit() {
    const resp = this.service.getDestinations();
    resp.subscribe((data) => this.destinations = data);
  }

}
