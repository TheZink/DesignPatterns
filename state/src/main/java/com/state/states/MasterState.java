package com.state.states;

import com.state.Machine;
import com.state.State;

public class MasterState extends State{

    public MasterState(Machine machine){
        super(machine);
    }

    @Override
    public void action(){
        System.out.println("You have gained a Master-level. Thank you for playing.\n");
        this.getMachine().printData();
        
        // TODO;
    }


}
