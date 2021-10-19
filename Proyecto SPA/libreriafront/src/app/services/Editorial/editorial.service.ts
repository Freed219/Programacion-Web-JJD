import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EditorialService {
  private API_SERVER ="http://localhost:8080/editorial/";
  constructor(
    private httpClient: HttpClient
  ) { }
  public getAllEditoriales(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }
}
