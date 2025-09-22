package com.example;

import java.util.HashMap;

public class Library {
    HashMap<Integer, DocumentInterface> content = new HashMap<>();

    public DocumentInterface getDocument(int id){
        return content.get(id);
    }

    public void addDocument(Integer documentId, DocumentInterface document){
        content.put(documentId, document);
    }


}
