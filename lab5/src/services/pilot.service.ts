import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Pilot } from '..model/Pilot';
import {Observable} from 'rxjs';

@Injectable()
export class PilotService {

  private pilotUrl: string;

  constructor(private http: HttpClient) {
    this.pilotUrl = 'http://localhost:8080/api/pilot';
  }

  public findAll(): Observable<Pilot[]> {
    return this.http.get<Pilot[]>(this.pilotUrl);
  }

  public save(pilot: Pilot) {
    return this.http.post<Pilot>(this.pilotUrl, pilot);
  }
}
