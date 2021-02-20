# JavaChatServer

This is an example of WebSocket used for a chat application. Communication will be bi-directional, so either server (this project) or client (...) can initiate sending a message.
Client and server communication are also independent (full duplex communication). 

This application also uses STOMP (Simple Text Oriented Messaging Protocol). While WebSocket is a communication protocol, STOMP describes the format of the exchanged messages between client and server. 
