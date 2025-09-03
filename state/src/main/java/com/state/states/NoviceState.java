package com.state.states;

import com.state.Machine;
import com.state.State;

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

        String[] options = {"Continue training","Stop training"};
        System.out.println("You have enteret to the training camp.");
        
        while (true){

            try{
                
                // Slow down the time and select random points
                Thread.sleep(random.nextInt(1000,3000));
                int xp = random.nextInt(0,5);
                score = score + xp;

                System.out.println("You gained "+ xp +" points from the training. Do you want to continue?" + 
                                " You have " + score + " points in total");

            } catch (InterruptedException e) {
                
                e.printStackTrace();

            }

            // Prompt options to the user
            switch (this.getMachine().userChoice(options)) {
                case 1:
                    System.out.println("You choosed to continue.");
                    continue;

                case 2:
                    this.getMachine().setScore(score);
                    this.getMachine().setCurrentState(new ReadyState(this.getMachine()));
                    return;
                default:
            }
            
        }
    }


}
