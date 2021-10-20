import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AutorService {
  private API_SERVER ="http://localhost:8080/autor/";
  constructor(
    private httpClient: HttpClient
  ) { }
  public getAllAutores(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }
}