import { Component, OnInit } from '@angular/core';
// import * as Stomp from 'stompjs';
import * as Stomp from '@stomp/stompjs';
import * as SockJS from 'sockjs-client';
import * as $ from 'jquery';
import { SocketService } from './socket.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  constructor(public quesservice: SocketService) {
   this.quesservice.callfrontend();
  // while(this.stompClient==null||this.stompClient.connected==false)
    this.initializeWebSocketConnection();
    //console.log("connected");
  console.log(this.stompClient);
  }
  ngOnInit(){

  }   
  //ws://localhost:3000
  serverUrl = 'http://localhost:8095/gkz-stomp-endpoint';
  title = 'WebSockets demo';
  stompClient;
  data;

  
  initializeWebSocketConnection() {
    let ws = new SockJS(this.serverUrl);
    this.stompClient = Stomp.over(ws);
    let that = this;

    this.stompClient.connect(
      {},
      function(frame) {
        that.stompClient.subscribe('/topic', message => {
          if (message.body) {
            that.data = message.body;
           // console.log('data is ', that.data);
            //console.log('message body is ', message.body);
          }   
        });  
      }  
    );
   
      console.log("nahi hua");
    
  }

  sendMessage(message) {
    this.stompClient.send('/gkz/hello', {}, message);
    $('#input').val('');
    console.log('inside the sendMessage');
  }
}
