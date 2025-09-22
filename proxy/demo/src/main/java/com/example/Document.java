package com.example;

public class Document implements DocumentInterface {
    protected int id;
    protected int date;
    protected String content;

    public Document(int id, int date, String content){
        this.id = id;
        this.date = date;
        this.content = content;
    }

    @Override
    public String getContent(User username, int documentId){
        return content;
    };

    @Override
    public int getCreationDate(){
        return date;
    };

    public int getId(){
        return id;
    }
}
