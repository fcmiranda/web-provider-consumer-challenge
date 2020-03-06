import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MessagesComponent } from './messages/messages.component';
import { InstructionsComponent } from './instructions/instructions.component';

const routes: Routes = [
  { path: 'challenge', component: MessagesComponent },
  { path: 'instructions', component: InstructionsComponent },
  { path: '', redirectTo: '/challenge', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
