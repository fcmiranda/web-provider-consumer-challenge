import { Injectable } from '@angular/core';
import { Message } from './message';
import { Observable, of } from 'rxjs';
import { NotificationService } from './notification.service';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MessageService {

  private url = '/ul/messages';
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient, private notificationService: NotificationService) {}

  getMessages(size: number): Observable<[Message[]]> {
    const params = new HttpParams().set('size', size.toString());

    params.append('size', size.toString());
    this.notificationService.notify('Messages fetched!');
    return this.http.get<[Message[]]>(this.url, {params});
  }

  generateMessages(total: number): Observable<any> {
    this.notificationService.notify('Messages generated on server!');
    return this.http.post<string>(this.url, {total}, this.httpOptions);
  }
}
