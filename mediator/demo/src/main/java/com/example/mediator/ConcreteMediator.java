package com.example.mediator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.example.Model.Message;
import com.example.controller.ChatController;

public class ConcreteMediator implements Mediator{
    private Map<String, ChatController> clients = new HashMap<>();

    @Override
    public void registerClient(String username, ChatController client){
        clients.put(username, client);
    }

    @Override
    public void sendMessage(Message message){
        ChatController recipient = clients.get(message.getToUser());

        if (recipient != null){
            recipient.receiveMessage(message.getFromUser(), message.getMessage());
        }

    }

    public Set<String> getAllUsernames(){
        return clients.keySet();
    }

}
