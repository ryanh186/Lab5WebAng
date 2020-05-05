import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Ticket } from '..model/Ticket';
import {Observable} from 'rxjs';

@Injectable()
export class TicketService {

  private ticketUrl: string;

  constructor(private http: HttpClient) {
    this.ticketUrl = 'http://localhost:8080/api/ticket';
  }

  public findAll(): Observable<Ticket[]> {
    return this.http.get<Ticket[]>(this.ticketUrl);
  }

  public save(ticket: Ticket) {
    return this.http.post<Ticket>(this.ticketUrl, ticket);
  }
}
