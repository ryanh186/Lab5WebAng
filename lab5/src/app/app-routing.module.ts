import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DestinationDetailComponent} from './destination-detail/destination-detail.component';
import {DestinationFormComponent} from './destination-form/destination-form.component';
import {ListAirplanesComponent} from './airplane/list-airplanes.component';
import {PassengerComponent} from './passenger/passenger.component';
import {PilotDetailsComponent} from './pilot-details/pilot-details.component';


const routes: Routes = [
  { path: 'destinations', component: DestinationDetailComponent },
  { path: 'register', component: DestinationFormComponent },
  {path: '', component: ListAirplanesComponent},
  {path: 'passengers', component: PassengerComponent},
  {path: 'pilots', component: PilotDetailsComponent}
];
@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
