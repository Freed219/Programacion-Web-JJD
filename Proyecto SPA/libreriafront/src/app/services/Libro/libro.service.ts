import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class LibroService {
  private API_SERVER = "http://localhost:8080/libro/"
  constructor(private httpClient: HttpClient) { }
  public getAllLibros(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }
  public saveLibro (libro:any): Observable<any>{
    return this.httpClient.post(this.API_SERVER,libro)
  }
  public deleteLibro(id):Observable<any>{
    return this.httpClient.delete(this.API_SERVER + "delete/"+id);
  }
}
