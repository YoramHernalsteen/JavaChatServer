package com.javachat.websocket.bean;

public class MessageBean {
    private String name;
    private String content;

    public String getName(){
        return this.name;
    }
    public String getContent(){
        return this.content;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setContent(String newContent){
        this.content = newContent;
    }
}
