import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import {DestinationServiceService} from '../destination-service.service';
import {Destinations} from './destinations';
import {Validators} from '@angular/forms';
import {FormArray} from '@angular/forms';
import {FormBuilder} from '@angular/forms';
import {User} from '../user';


@Component({
  selector: 'app-destination-form',
  templateUrl: './destination-form.component.html',
  styleUrls: ['./destination-form.component.css']
})
export class DestinationFormComponent implements OnInit {

  constructor(

    private service: DestinationServiceService)

  {}

  destination: Destinations = new Destinations('', '', '');
  message: any;



  public registerNow() {
    const resp = this.service.doRegistration(this.destination);
    resp.subscribe((data) => this.message = data);
  }

  ngOnInit(): void {
  }











}
