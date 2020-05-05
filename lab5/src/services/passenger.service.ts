import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Passenger } from '..model/Passenger';
import {Observable} from 'rxjs';

@Injectable()
export class PassengerService {

  private passengerUrl: string;

  constructor(private http: HttpClient) {
    this.passengerUrl = 'http://localhost:8080/api/passenger';
  }

  public findAll(): Observable<Passenger[]> {
    return this.http.get<Passenger[]>(this.passengerUrl);
  }

  public save(passenger: Passenger) {
    return this.http.post<Passenger>(this.passengerUrl, passenger);
  }
}
