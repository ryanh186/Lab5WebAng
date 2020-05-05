import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {RouterModule} from '@angular/router';

import { ListAirplanesComponent } from './airplane/list-airplanes.component';
import { PassengerComponent } from './passenger/passenger.component';
import { TopBarComponent } from './top-bar/top-bar.component';
import { ProductListComponent } from './product-list/product-list.component';
import { DestinationDetailComponent } from './destination-detail/destination-detail.component';
import { PilotDetailsComponent } from './pilot-details/pilot-details.component';
import { DestinationFormComponent } from './destination-form/destination-form.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {DestinationServiceService} from './destination-service.service';


@NgModule({
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  declarations: [
    AppComponent,
    ListAirplanesComponent,
    PassengerComponent,
    TopBarComponent,
    ProductListComponent,
    DestinationDetailComponent,
    PilotDetailsComponent,
    DestinationFormComponent,
  ],
  providers: [DestinationServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
