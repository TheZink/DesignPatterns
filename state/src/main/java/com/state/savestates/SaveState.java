package com.state.savestates;

import com.state.Machine;
import com.state.State;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;

public class SaveState extends State{

    public SaveState(Machine machine){
        super(machine);
    }

    public void action(){
        System.out.println("Saving your data...");

        // Store user data
        JsonObject userData = new JsonObject();

        userData.addProperty("name", this.getMachine().getName());
        userData.addProperty("score", this.getMachine().getScore());
        userData.addProperty("health", this.getMachine().getHealth());

        // Save user data to json
        Gson gson = new Gson();

        try(FileWriter writer = new FileWriter("src/main/java/com/state/savedata/" + this.getMachine().getName() + ".json")){
            gson.toJson(userData, writer);
            System.out.println("Data was saved successfully");
        } catch (IOException e){
            e.printStackTrace();
        }

        this.getMachine().setCurrentState(this.getMachine().getPreviousState());


    }

}
