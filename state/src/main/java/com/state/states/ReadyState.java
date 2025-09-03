package com.state.states;

import com.state.Machine;
import com.state.State;

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
                
                // If player want create a profile
                case 1:
                    String name = this.getMachine().userInput("What is your name?");
                    this.getMachine().setName(name);
                    this.getMachine().setCurrentState(new SaveState(getMachine()));
                    break;

                // If player wants use existing profile
                case 2:
                    System.out.println("Case 2");
                    break;
                default:
                    System.out.println("Error in input. Try again");
            }

        } else if (this.getMachine().getName() != null){

            System.out.println("What level you want to choose?");
            String[] options = {"Novice", "Intermediate", "Expert", "Master", "Save", "Exit"};

            switch (this.getMachine().userChoice(options)) {
                case 1:
                    System.out.println("You choosed Novice. Noob!");
                    break;
                case 2:
                    System.out.println("You choosed Novice. Its a progress!");
                    break;
                case 3:
                    System.out.println("You choosed Novice. Badass!");
                    break;
                case 4:
                    System.out.println("Yes my master!");
                    break;
                case 5:
                    System.out.println("Saving game.");
                    this.getMachine().setCurrentState(new SaveState(getMachine()));
                    break;
                case 6:
                    return;

                default:
                    System.out.println("Wrong input. Try again");
                
            }
        }
    }
        
}


