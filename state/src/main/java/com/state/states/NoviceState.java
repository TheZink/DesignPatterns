package com.state.states;

import com.state.Machine;
import com.state.State;
import com.state.savestates.SaveState;

import java.util.Random;

public class NoviceState extends State{
    Random random = new Random();
    int score;

    public NoviceState(Machine machine){
        super(machine);
        this.score = this.getMachine().getScore();
    }

    @Override
    public void action(){

        String[] options = {"Training", "Save progress", "Exit"};
        this.getMachine().printData();
        
        while (true){
            
            // If score target met, change state to the next level
            if (this.getMachine().getScore() >= 5) {
                System.out.println("You gained enough points! You are moving to the Intermediate-level\n");
                this.getMachine().setLevel("Intermediate");
                this.getMachine().setCurrentState(new IntermediateState(this.getMachine()));
                break;
            }
            
            // Prompt options to the user
            switch (this.getMachine().userChoice(options)) {
                case 1:
                    try{
                        
                        // Slow down the time and select random points
                        Thread.sleep(random.nextInt(1000,3000));
                        int xp = random.nextInt(1,6);
                        score = score + xp;
        
                        System.out.println("You gained "+ xp +" points from the training.\n" + 
                                        "You have " + score + " points in total\n");
        
                    } catch (InterruptedException e) {
                        
                        e.printStackTrace();
        
                    }
        
                    this.getMachine().setScore(score);
                    break;

               case 2:
                    System.out.println("Saving game.");
                    this.getMachine().setCurrentState(new SaveState(getMachine()));
                    return;
                
                // If player select exit
                case 3:
                    this.getMachine().setCurrentState(new ReadyState(this.getMachine()));
                    return;
            }
            
        }
    }
}
