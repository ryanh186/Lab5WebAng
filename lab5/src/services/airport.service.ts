import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Airport } from '..model/Airport';
import {Observable} from 'rxjs';

@Injectable()
export class AirportService {

  private airportUrl: string;

  constructor(private http: HttpClient) {
    this.airportUrl = 'http://localhost:8080/api/airport';
  }

  public findAll(): Observable<Airport[]> {
    return this.http.get<Airport[]>(this.airportUrl);
  }

  public save(airport: Airport) {
    return this.http.post<Airport>(this.airportUrl, airport);
  }
}
