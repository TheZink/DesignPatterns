package com.state.states;

import com.state.Machine;
import com.state.State;

public class MasterState extends State{

    public MasterState(Machine machine){
        super(machine);
    }

    @Override
    public void action(){
        if (this.getMachine().getScore() < 20){
            System.out.println("\nYou dont have enough XP for this level!\n");
        } 
        
        else {
            System.out.println("You have reached to the Master-level! Thank you for playing.\n" + 
                                "Closing game!\n");
            this.getMachine().printData();
            this.getMachine().setCurrentState(null);
        }

    }


}
