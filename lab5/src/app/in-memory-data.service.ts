import { Injectable } from '@angular/core';
import {InMemoryDbService} from 'angular-in-memory-web-api';
import {Destinations} from './destination-form/destinations';

@Injectable({
  providedIn: 'root'
})
export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const destinations = [
    ];
    return {destinations};
  }

  constructor() { }
}
