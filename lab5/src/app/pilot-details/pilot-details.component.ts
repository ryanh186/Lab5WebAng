import { Component, OnInit } from '@angular/core';
import {pilots} from './pilots';

@Component({
  selector: 'app-pilot-details',
  templateUrl: './pilot-details.component.html',
  styleUrls: ['./pilot-details.component.css']
})
export class PilotDetailsComponent implements OnInit {
  pilots = pilots;
  constructor() { }

  ngOnInit(): void {
  }

}
