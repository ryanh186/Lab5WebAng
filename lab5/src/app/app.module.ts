import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {RouterModule} from '@angular/router';

import { ListAirplanesComponent } from './airplane/list-airplanes.component';
import { PassengerComponent } from './passenger/passenger.component';
import { TopBarComponent } from './top-bar/top-bar.component';
import { ProductListComponent } from './product-list/product-list.component';
import { DestinationDetailComponent } from './destination-detail/destination-detail.component';

@NgModule({
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path: '', component: ListAirplanesComponent },
      { path: 'destinations/:destinationId', component: DestinationDetailComponent },
    ])
  ],
  declarations: [
    AppComponent,
    ListAirplanesComponent,
    PassengerComponent,
    TopBarComponent,
    ProductListComponent,
    DestinationDetailComponent,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
