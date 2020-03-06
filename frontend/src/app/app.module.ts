import { BrowserModule } from '@angular/platform-browser';
import { NgModule, LOCALE_ID } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';

import { FlexLayoutModule } from '@angular/flex-layout';

import { MatSliderModule } from '@angular/material/slider';
import {MatDividerModule} from '@angular/material/divider';
import {MatListModule} from '@angular/material/list';
import {MatButtonModule} from '@angular/material/button';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {MatTableModule} from '@angular/material/table';
import {MatInputModule} from '@angular/material/input';


import { registerLocaleData } from '@angular/common';
import localePtBr from '@angular/common/locales/pt';

import { AppComponent } from './app.component';
import { MessagesComponent } from './messages/messages.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { InstructionsComponent } from './instructions/instructions.component';

registerLocaleData(localePtBr, 'pt');

@NgModule({
  declarations: [
    AppComponent,
    MessagesComponent,
    InstructionsComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    FlexLayoutModule,
    MatSliderModule,
    MatDividerModule,
    MatListModule,
    MatButtonModule,
    MatSnackBarModule,
    MatTableModule,
    MatInputModule
  ],
  providers: [ {provide: LOCALE_ID, useValue: 'pt'}],
  bootstrap: [AppComponent]
})
export class AppModule { }
