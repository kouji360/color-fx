import {Injectable} from '@angular/core';

import {FxColorPair} from '../../FxColorPair';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ColorPairService {

  constructor(private http: HttpClient) {
  }


  public getColorPair(colorPairCode: number): Observable<Object> {
    const params = new HttpParams().set('colorPairCode', colorPairCode.toString());
    const headers: HttpHeaders = new HttpHeaders();
    headers.append('Access-Control-Allow-Origin', '*');
    return this.http.get<FxColorPair>('http://localhost:8080/api/color/colorPair/', {headers: headers, params: params});
  }
}
