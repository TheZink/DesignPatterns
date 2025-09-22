package com.example;

public class Main {
    public static void main(String[] args) {
        
        // Create users
        User user1 = new User("Kalle");
        User user2 = new User("Lauri");

        // Create documents
        Document proxyDocument = new Document(1,22092025, "Protected content");
        Document publicDocument = new Document(2, 22092025, "Unprotected content");
        
        // Create proxies and add protected documents
        DocumentProxy proxy = new DocumentProxy(proxyDocument);

        // Create library and add documents
        Library library = new Library();
        library.addDocument(1, proxy);
        library.addDocument(2, publicDocument);

        // This print always content
        System.out.println("Print unprotected documents: " + library.getDocument(2).getContent(user2, 2) + "\n");

        // This should print "Access denied", because user is not allowed to view document
        try {
            System.out.println("Print protected documents: " + library.getDocument(1).getContent(user2, 1)  + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // This should print "Protected content"
        try {
            System.out.println("Print protected documents: " + library.getDocument(1).getContent(user1, 1)  + "\n");  
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}