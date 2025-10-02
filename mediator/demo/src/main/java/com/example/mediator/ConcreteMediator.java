package com.example.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.Model.Message;
import com.example.controller.ChatController;

public class ConcreteMediator implements Mediator{
    private Map<String, ChatController> clients = new HashMap<>();

    @Override
    public void registerClient(String username, ChatController client){
        clients.put(username, client);
        updateList();
    }

    @Override
    public void sendMessage(Message message){
        ChatController recipient = clients.get(message.getToUser());

        if (recipient != null){
            recipient.receiveMessage(message.getFromUser(), message.getMessage());
        }

    }

    public List<String> getAllUsernames(){
        return new ArrayList<>(clients.keySet());
    }

    public void updateList(){
        for (ChatController controller : clients.values()){
            controller.setUser();
        }
    }
}
