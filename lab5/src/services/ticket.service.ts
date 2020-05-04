import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Ticket} from '../app/ticket/ticket';
import {Observable} from 'rxjs';

const headers = new HttpHeaders({'Content-Type': 'application/json'});

export class TicketService {

  constructor(private http: HttpClient) {
  }

  getTicketById(id: number): Observable<Ticket> {
    const url = 'http://localhost:8080/api/ticket';

    return this.http.get<Ticket>(url);
  }



}
