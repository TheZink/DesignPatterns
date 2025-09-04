package com.state.states;

import com.state.Machine;
import com.state.State;

import java.util.Random;

public class ExpertState extends State {
    int score;
    int health;
    Random random;

    public ExpertState(Machine machine){
        super(machine);
        this.random = new Random();
        this.score = this.getMachine().getScore();
        this.health = this.getMachine().getHealth();
    }

    @Override
    public void action(){

        String[] options = {"Explore", "Exit"};

        while (true) {

            if (score >= 35) {
                System.out.println("You gained enough points! You are moving to the Master-level\n");
                this.getMachine().setScore(score);
                this.getMachine().setHealth(health);
                this.getMachine().setCurrentState(new MasterState(this.getMachine()));
                return;
            }
            
            else if (score < 25) {
                System.out.println("You dont have enough points!\n");
                this.getMachine().setScore(score);
                this.getMachine().setHealth(health);
                this.getMachine().setCurrentState(new ReadyState(this.getMachine()));
                return;
            }

            else if (health <= 0) {
                System.out.println("You dont have enough health. Heal yourself!\n");
                this.getMachine().setCurrentState(new ReadyState(this.getMachine()));
                return;
            } 
                        
            this.getMachine().printData();
            
            switch (this.getMachine().userChoice(options)) {

                case 1:
                try {
                    Thread.sleep(random.nextInt(1000, 3000));
                    int xp = random.nextInt(0, 5);
                    score = score + xp;

                    int fight = random.nextInt(0,10);
                    int hp = random.nextInt(0,20);

                    if (fight % 2 == 0){
                        System.out.println("Fight print. Damage: " + hp + " taken. Total hp: " + health);
                        health = health - hp;
                    }

                    System.out.println("You gained " + xp + " points from the training.\n" +
                            "You have " + score + " points in total\n" +
                            "Do you want to continue?\n");
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
                    break;
            
                case 2:
                    this.getMachine().setScore(score);
                    this.getMachine().setHealth(health);
                    this.getMachine().setCurrentState(new ReadyState(this.getMachine()));
                    break;
            }

           
        }
    }
}
