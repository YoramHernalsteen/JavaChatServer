package com.javachat.websocket.models;

public class Message {
    private String content;

    public Message(){
    }

    public Message(String newContent){
        this.content = newContent;
    }

    public String getContent(){
        return this.content;
    }

    public void setContent(String newContent){
        this.content = newContent;
    }
}
