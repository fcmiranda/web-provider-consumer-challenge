import { Injectable } from '@angular/core';
import {MatSnackBar} from '@angular/material/snack-bar';

@Injectable({
  providedIn: 'root'
})
export class NotificationService {
  constructor(private snackBar: MatSnackBar) {}

  public notify(message) {
    this.snackBar.open(message, 'close', {
      duration: 2000,
    });
  }

}
