package com.example.mediator;

import com.example.Model.Message;
import com.example.controller.ChatController;

public interface Mediator {
    void registerClient(String username, ChatController client);
    void sendMessage(Message message);
}