package com.state;

public class Player {
    private String name;
    private String level;
    private int score;
    private int health;

    public Player() {
        this.name = null;
        this.score = 0;
        this.health = 100;
        this.level = "Novice";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }


    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }
}
