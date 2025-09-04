package com.state.states;

import com.state.Machine;
import com.state.State;
import com.state.savestates.LoadState;
import com.state.savestates.SaveState;

public class ReadyState extends State {

    public ReadyState(Machine machine){
        super(machine);
    }

    @Override
    public void action(){

        // This is first phase, when launching game
        if (this.getMachine().getName() == null){

            String[] options = {"Create new save", "Select save"};
            switch (this.getMachine().userChoice(options)) {
                
                // // If the player wants to create a profile, prompt for a name and change state
                case 1:
                    String createName = this.getMachine().userInput("What is your name?");
                    this.getMachine().setName(createName);
                    this.getMachine().setCurrentState(new SaveState(getMachine()));
                    break;

                // // If the player wants to use an existing profile, prompt for a name and change state
                case 2:
                    String loadName = this.getMachine().userInput("What is your profile name?");
                    this.getMachine().setName(loadName);
                    this.getMachine().setCurrentState(new LoadState(getMachine()));
                    break;
                
                // Give input error
                default:
                    System.out.println("Error input. Try again");
            }

        } else if (this.getMachine().getName() != null){

            this.getMachine().printData();

            System.out.println("Which level do you want to choose?");
            String[] options = {"Novice", "Intermediate", "Expert", "Master", "Save", "Exit"};

            switch (this.getMachine().userChoice(options)) {
                case 1:
                    System.out.println("You have enteret to the training camp.");
                    this.getMachine().setCurrentState(new NoviceState(getMachine()));
                    break;
                case 2:
                    System.out.println("You have entered to the training camp.\n" +
                                    "You can train or meditate in this level.");
                    System.out.println();
                    this.getMachine().setCurrentState(new IntermediateState(getMachine()));
                    break;
                case 3:
                    System.out.println("You choosed Novice. Badass!");
                    this.getMachine().setCurrentState(new ExpertState(getMachine()));
                    break;
                case 4:
                    System.out.println("Yes my master!");
                    break;
                case 5:
                    System.out.println("Saving game.");
                    this.getMachine().setCurrentState(new SaveState(getMachine()));
                    break;
                case 6:
                    this.getMachine().setCurrentState(null);
                    return;

                default:
                    System.out.println("Wrong input. Try again.");
                
            }
        }
    }
        
}


