import { Component, OnInit } from '@angular/core';
import { passengers } from '../passengers';

@Component({
  selector: 'app-passenger',
  templateUrl: './passenger.component.html',
  styleUrls: ['./passenger.component.css']
})
export class PassengerComponent implements OnInit {
  passengers = passengers;
  constructor() { }

  ngOnInit(): void {
  }

}
