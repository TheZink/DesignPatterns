package com.example.controller;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;


import com.example.mediator.Mediator;
import com.example.Model.Message;

public class ChatController {
    private Mediator mediator;
    private String username;

    private TextArea messageArea;
    private TextField inputField;
    private ComboBox<String> recipientBox;
    private Button sendButton;

    public ChatController(Mediator mediator, String username, TextArea messageArea, TextField inputField, ComboBox<String> recipientBox, Button sendButton){
        this.mediator = mediator;
        this.username = username;
        this.messageArea = messageArea;
        this.inputField = inputField;
        this.recipientBox = recipientBox;
        this.sendButton = sendButton;
        
        mediator.registerClient(username, this);

        sendButton.setOnAction(e -> sendMessage());
    }

    public void sendMessage(){
        String messageText = inputField.getText();
        String recipient = recipientBox.getValue();

        if (recipient != null && !messageText.isEmpty()){
            Message message = new Message(messageText, recipient, username);
            mediator.sendMessage(message);
            inputField.clear();
            messageArea.appendText("To: " + recipient + ": " + messageText + "\n");
        }
    }

    public void receiveMessage(String sender, String message){
        messageArea.appendText("From: " + sender + ": " + message + "\n");
    }



}
