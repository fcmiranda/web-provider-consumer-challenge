import { NotificationService } from './../notification.service';
import { MessageService } from './../message.service';
import { Message } from './../message';

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-messages',
  templateUrl: './messages.component.html',
  styleUrls: ['./messages.component.css']
})
export class MessagesComponent implements OnInit {
  listMessages: string[];
  generated: boolean;
  constructor(private messageService: MessageService, private notificationService: NotificationService) {
  }

  ngOnInit() {
  }

  generateMessages(total: number): void {
   this.messageService.generateMessages().subscribe(response => console.log(response));
  }

  getMessages(size: number): void {
   this.messageService.getMessages().subscribe(listMessages => this.listMessages = listMessages);
  }

}
