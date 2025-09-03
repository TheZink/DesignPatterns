package com.state;

public abstract class State {
    private Machine machine;

    public State(Machine machine){
        this.machine = machine;
    }

    public Machine getMachine(){
        return machine;
    }

    public abstract void action();

}
