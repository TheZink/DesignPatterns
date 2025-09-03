package com.state.savestates;

import com.state.State;
import com.state.Machine;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileReader;

public class LoadState extends State {

    public LoadState(Machine machine){
        super(machine);
    }

    public void action(){
        
        String fileName = "src/main/java/com/state/savedata/" + this.getMachine().getName() + ".json";
        
        try (FileReader reader = new FileReader(fileName)){

            // If profile exists, load the data and save it to the Player class
            System.out.println("Loading your save file...");
            Gson gson = new Gson();
            JsonObject userData = gson.fromJson(reader, JsonObject.class);

            this.getMachine().setName(userData.get("name").getAsString());
            this.getMachine().setScore(userData.get("score").getAsInt());
            this.getMachine().setHealth(userData.get("health").getAsInt());

            System.out.println("Load is complete!\n");

        } catch (Exception e) {

            // If the file doesn't exist or there is an error, show an error
            System.out.println("File not found or there was a error. Try again! " + e);
            this.getMachine().setName(null);

        } finally{

            this.getMachine().setCurrentState(this.getMachine().getPreviousState());

        }
    }
}
