import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Destination} from '../app/destination/destination';
import {Observable} from 'rxjs';

const headers = new HttpHeaders({'Content-Type': 'application/json'});

export class DestinationService {

  constructor(private http: HttpClient) {
  }

  getDestinationById(id: number): Observable<Destination> {
    const url = 'http://localhost:8080/api/destination';

    return this.http.get<Destination>(url);
  }



}
