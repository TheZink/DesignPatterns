package com.example;

import com.example.mediator.ConcreteMediator;
import com.example.mediator.Mediator;
import com.example.view.GUI;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        Mediator mediator = new ConcreteMediator();

        new GUI(mediator, "Ilkka").start(new Stage());
        new GUI(mediator, "Jukka").start(new Stage());
        new GUI(mediator, "Hanna").start(new Stage());
    }

    public static void main(String[] args){
        launch(args);
    }

}
