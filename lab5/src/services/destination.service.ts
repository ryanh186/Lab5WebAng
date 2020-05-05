import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Destination } from '..model/Destination';
import {Observable} from 'rxjs';

@Injectable()
export class DestinationService {

  private destinationUrl: string;

  constructor(private http: HttpClient) {
    this.destinationUrl = 'http://localhost:8080/destination';
  }

  public findAll(): Observable<Destination[]> {
    return this.http.get<Destination[]>(this.destinationUrl);
  }

  public save(destination: Destination) {
    return this.http.post<Destination>(this.destinationUrl, destination);
  }
}
