package com.state.states;

import com.state.Machine;
import com.state.State;

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
        
        String[] options2 = {"Training", "Meditate", "Exit"};

        this.getMachine().printData();
        
        while (true) {

            if (score >= 25) {
                System.out.println("You gained enough points! You are moving to the Expert-level\n");
                this.getMachine().setScore(score);
                this.getMachine().setHealth(health);
                this.getMachine().setCurrentState(new ExpertState(this.getMachine()));
                return;
            }
            
            // If player dont have enough points
            else if (score < 15){
                System.out.println("\nYou dont have enough XP for this level!\n");
                this.getMachine().setCurrentState(new ReadyState(this.getMachine()));
                return;
            }

            switch (this.getMachine().userChoice(options2)) {

                // If player select training
                case 1:
                    try{
                    
                        // Slow down the time and select random points
                        Thread.sleep(random.nextInt(1000,3000));
                        int xp = random.nextInt(0,5);
                        score = score + xp;

                        System.out.println("You gained "+ xp +" points from the training.\n" + 
                                        "You have " + score + " points in total\n" +
                                        "Do you want to continue?");

                        } catch (InterruptedException e) {
            
                            e.printStackTrace();
                        }

                    break;
            
                // If player select to meditate
                case 2:
                        try {

                            // Check if player health is full
                            if(health == 100) {
                                System.out.println("\nNo need healing");
                                return;
                            }

                            Thread.sleep(random.nextInt(1000, 3000));
                            int hp = random.nextInt(0, 5);
                            health = health + hp;

                            System.out.println("You gained " + hp + " health from the metidating.\n" +
                                            "You have " + health + " health in total\n" +
                                            "Do you want to continue?");

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        break;

                    // If player select Exit
                    case 3:
                        this.getMachine().setScore(score);
                        this.getMachine().setHealth(health);
                        this.getMachine().setCurrentState(new ReadyState(this.getMachine()));
                        return;
            }  
        } 
    }
}
