package com.example;

public interface DocumentInterface {

    String getContent(User username, int documentId);
    int getCreationDate();
}