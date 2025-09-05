package com.state.states;

import com.state.Machine;
import com.state.State;
import com.state.savestates.SaveState;

import java.util.Random;

public class IntermediateState extends State {
    Random random = new Random();
    int score;
    int health;

    public IntermediateState(Machine machine){
        super(machine);
        this.score = this.getMachine().getScore();
        this.health = this.getMachine().getHealth();
    }

    @Override
    public void action(){
        
        String[] options2 = {"Training", "Meditate", "Save progress", "Exit"};

        this.getMachine().printData();
        
        while (true) {

            // If score and health target met, change state to the next level
            if (this.getMachine().getScore() >= 10) {
                System.out.println("You gained enough points and health! You are moving to the Expert-level\n");
                this.getMachine().setLevel("Expert");
                this.getMachine().setCurrentState(new ExpertState(this.getMachine()));
                return;
            }
            
            // If player dont have enough points
            else if (this.getMachine().getScore() < 5){
                System.out.println("\nYou dont have enough XP for this level!\n");
                this.getMachine().setCurrentState(new ReadyState(this.getMachine()));
                return;
            }

            switch (this.getMachine().userChoice(options2)) {

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
                                System.out.println("\nNo need healing\n");
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

                case 3:
                    System.out.println("Saving game.");
                    this.getMachine().setCurrentState(new SaveState(getMachine()));
                    return;
                
                // If player select exit
                case 4:
                    this.getMachine().setCurrentState(new ReadyState(this.getMachine()));
                    return;
            }  
        } 
    }
}
