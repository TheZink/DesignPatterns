package com.state;

import java.util.Scanner;

import com.state.states.ReadyState;

public class Machine {
    private static Scanner scanner = new Scanner(System.in);
    private State currentState;
    private State previousState;
    private Player playerData;

    public Machine(){
        currentState = new ReadyState(this);
        this.playerData = new Player();
    }

    public void operate(){
        while (true){
            if (currentState == null){
                System.out.println("Error occurred in Machine-class. State is " + currentState);
                return;
            }
            currentState.action();
        }
    }

    // Game

    public int userChoice(String[] options){
        System.out.println("\nSelect option:");

        for (int i = 1; i <= options.length; i++){
            System.out.println(i + ". " + options[i-1]);
        }
        String choice = scanner.nextLine();

        return Integer.parseInt(choice);
    }

    public String userInput(String promt){
        System.out.println(promt);
        String input = scanner.nextLine();

        return input;
    }

    // Set current and previous state. PreviousState is for SaveState only.

    public void setCurrentState(State state){
        this.previousState = currentState;
        this.currentState = state; 
    }

    public State getPreviousState(){
        return previousState;
    }

    // Player data

    public void setName(String name){
        playerData.setName(name);
    }

    public String getName(){
        return playerData.getName();
    }

    public void setLevel(String level){
        playerData.setLevel(level);
    }

    public String getLevel(){
        return playerData.getLevel();
    }

    public void setScore(int score){
        playerData.setScore(score);
    }

    public int getScore(){
        return playerData.getScore();
    }

    public void setHealth(int health){
        playerData.setHealth(health);
    }

    public int getHealth(){
        return playerData.getHealth();
    }

    public void printData(){
        System.out.println("Character stats\n" +
                            "Name: " + getName() + "\n" +
                            "Score: " + getScore() + "\n" +
                            "Healt: " + getHealth() + "\n");
    }

}
