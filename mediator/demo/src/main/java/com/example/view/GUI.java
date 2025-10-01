package com.example.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.example.mediator.Mediator;
import com.example.controller.ChatController;

public class GUI extends Application{
    private Mediator mediator;
    private String username;

    public GUI(){}

    public GUI(Mediator mediator, String username){
        this.mediator = mediator;
        this.username = username;
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Amazing chat window");

        TextArea messageArea = new TextArea();
        messageArea.setEditable(false);

        TextField inputField = new TextField();
        ComboBox<String> recipientBox = new ComboBox<>();
        Button sendButton = new Button("Send");

        VBox layout = new VBox(10, messageArea, recipientBox, inputField, sendButton);
        Scene scene = new Scene(layout, 400, 300);

        new ChatController(mediator, username, messageArea, inputField, recipientBox, sendButton);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
