import { Component } from '@angular/core';
import {DestinationService} from '../../services/destination.service';
import {Destination} from './destination';

@Component({
  selector: 'app-destination',
  templateUrl: './destination.component.html',
  styleUrls: []
})
export class DestinationComponent {
  title = 'Lab 5 Airplane Management';

  isLoading: boolean;
  destination: Destination;

  constructor(private destinationService: DestinationService) {
    this.isLoading = true;
    this.destinationService.getDestinationById(1)
      .subscribe((destination: Destination) => {
        this.destination = destination;
        this.isLoading = false;
    });
  }


}
