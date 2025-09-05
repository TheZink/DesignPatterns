package com.state.states;

import com.state.Machine;
import com.state.State;
import com.state.savestates.SaveState;

import java.util.Random;

public class ExpertState extends State {
    Random random = new Random();
    int score;
    int health;

    public ExpertState(Machine machine){
        super(machine);
        this.score = this.getMachine().getScore();
        this.health = this.getMachine().getHealth();
    }

    @Override
    public void action(){

        String[] options = {"Training", "Meditate", "Fight", "Save progress", "Exit"};

        while (true) {

            if (this.getMachine().getScore() >= 20) {
                System.out.println("You gained enough points! You are moving to the Master-level\n");
                this.getMachine().setLevel("Master");
                this.getMachine().setCurrentState(new MasterState(this.getMachine()));
                return;
            }
            
            else if (this.getMachine().getScore() < 10) {
                System.out.println("You dont have enough points for the Expert-level\n");
                this.getMachine().setScore(score);
                this.getMachine().setHealth(health);
                this.getMachine().setCurrentState(new ReadyState(this.getMachine()));
                return;
            }
                        
            this.getMachine().printData();
            
            switch (this.getMachine().userChoice(options)) {

                // If player select training
                case 1:
                    try{
                    
                        // Slow down the time and select random value
                        Thread.sleep(random.nextInt(1000,3000));
                        int xp = random.nextInt(0,5);
                        score = score + xp;

                        System.out.println("You gained "+ xp +" points from the training.\n" + 
                                        "You have " + score + " points in total\n");

                        } catch (InterruptedException e) {
            
                            e.printStackTrace();
                        }
                        
                        this.getMachine().setScore(score);
                    break;
            
                // If player select to meditate
                case 2:
                        try {

                            // Check if player health is full
                            if(health >= 100) {
                                System.out.println("\nNo need healing");
                                return;
                            }

                            // Slow down the time and select random value
                            Thread.sleep(random.nextInt(1000, 3000));
                            int hp = random.nextInt(0, 5);
                            health = health + hp;
                            if (health > 100){ health = 100; } // If health is above 100, change it to 100.

                            System.out.println("You gained " + hp + " health from the metidating.\n" +
                                            "You have " + health + " health in total\n");

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        this.getMachine().setHealth(health);
                        break;

                    // If player select Fight
                case 3:

                    try {

                        // Check if player health is under 5
                        if(health <= 5) {
                            System.out.println("\nYou need healing! You cannot fight!");
                            return;
                        }

                        // Slow down the time and select random value
                        Thread.sleep(random.nextInt(1000, 3000));
                        int damage = random.nextInt(0, 10);
                        health = health - damage;

                        int xp = random.nextInt(0,5);
                        score = score + xp;

                        System.out.println("You took " + damage + " damage from the fight." +
                                        "You also gained " + xp + "\n" +
                                        "Your health is now " + health + " and score is " + score + "\n");

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    
                    this.getMachine().setScore(score);
                    this.getMachine().setHealth(health);

                    break;
                
                case 4:
                    System.out.println("Saving game.");
                    this.getMachine().setCurrentState(new SaveState(getMachine()));
                    return;
                
                // If player select exit
                case 5:
                    this.getMachine().setCurrentState(new ReadyState(this.getMachine()));
                    return;
                        
            }     
        }
    }
}
