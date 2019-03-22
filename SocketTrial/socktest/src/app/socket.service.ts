import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class SocketService {
                     
   private url6 ='http://localhost:8095/demo/hi';
  
  constructor(private _http: HttpClient) { }


  public callfrontend(){
   this._http.get(this.url6).subscribe();
  }
}
