import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Observable} from 'rxjs';
import {Destinations} from './destination-form/destinations';

@Injectable({
  providedIn: 'root'
})
export class DestinationServiceService {
  private destinationUrl: string;



  constructor(private http: HttpClient) {
    this.destinationUrl = 'http://localhost:8080/api/destination';
  }

  public findAll(): Observable<Destinations[]> {
    return this.http.get<Destinations[]>(this.destinationUrl);
  }

  public doRegistration(destination){
    return this.http.post('http://localhost:8080/api/destinationTest', destination, {responseType: 'text' as 'json'});
  }

  public getDestinations(){
    return this.http.get('http://localhost:8080/getAllDestinations');
  }

  public save(destination) {
    return this.http.post<Destinations>(this.destinationUrl, destination);
  }
}
