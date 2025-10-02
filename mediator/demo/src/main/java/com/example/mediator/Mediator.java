package com.example.mediator;

import java.util.List;

import com.example.Model.Message;
import com.example.controller.ChatController;

public interface Mediator {
    void registerClient(String username, ChatController client);
    void sendMessage(Message message);
    List<String> getAllUsernames();
    void updateList();
}