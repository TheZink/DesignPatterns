package com.example;

import java.util.Arrays;

public class AccessControlService {
    private static AccessControlService instance;
    private String[] allowedUsers = {"Kalle"};

    public static AccessControlService getInstance(){
        if (instance == null){
                instance = new AccessControlService();
            }
        
        return instance;
    }

    public boolean isAllowed(User userName){
        if (Arrays.asList(allowedUsers).contains(userName.getUser())){
            return true;
        } else {
            return false;
        }

    }
}
