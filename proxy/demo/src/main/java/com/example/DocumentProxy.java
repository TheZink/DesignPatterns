package com.example;

public class DocumentProxy implements DocumentInterface{
    private static AccessControlService accessControl = AccessControlService.getInstance();
    private Document document;

    public DocumentProxy(Document document){
        this.document = document;
    }
    
    @Override
    public String getContent(User username, int documentId){

        if (accessControl.isAllowed(username)){
            return document.getContent(username, documentId);
        }

        throw new AccessDeniedException("Access denied");
    }
    
    @Override
    public int getCreationDate(){
        return document.getCreationDate();
    }
}
