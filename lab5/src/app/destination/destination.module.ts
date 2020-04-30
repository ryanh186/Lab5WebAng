import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { DestinationComponent } from './destination.component';
import {RouterModule} from "@angular/router";

@NgModule({
  declarations: [
    DestinationComponent
  ],
  imports: [
    BrowserModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [DestinationComponent]
})
export class DestinationModule { }
