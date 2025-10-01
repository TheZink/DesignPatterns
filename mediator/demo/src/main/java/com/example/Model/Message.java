package com.example.Model;

public class Message {
    private final String message;
    private final String toUser;
    private final String fromUser;

    public Message(String message, String toUser, String fromUser){
        this.message = message;
        this.toUser = toUser;
        this.fromUser = fromUser;
    }

    public String getMessage(){
        return message;
    }

    public String getToUser(){
        return toUser;
    }

    public String getFromUser(){
        return fromUser;
    }

}
