import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {RouterModule} from '@angular/router';
import {DestinationModule} from './destination/destination.module';

import { ListAirplanesComponent } from './airplane/list-airplanes.component';
import { PassengerComponent } from './passenger/passenger.component';
import { TopBarComponent } from './top-bar/top-bar.component';
import { ProductListComponent } from './product-list/product-list.component';

@NgModule({
  imports: [
    BrowserModule,
    DestinationModule,
    RouterModule.forRoot([
      { path: '', component: ListAirplanesComponent },
    ])
  ],
  declarations: [
    AppComponent,
    ListAirplanesComponent,
    PassengerComponent,
    TopBarComponent,
    ProductListComponent,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
