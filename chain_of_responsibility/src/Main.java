public class Main {
    public static void main(String[] args) {

        // Create handler chain
        Handler claimHandler = new CompensationClaimHandler();
        Handler contactHandler = new ContactRequestHandler();
        Handler developerHandler = new DevelopmentSuggestionHandler();
        Handler generalHandler = new GeneralFeedBackHandler();

        claimHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(developerHandler);
        developerHandler.setNextHandler(generalHandler);
        generalHandler.setNextHandler(null);
        
        // Create a message
        Message message1 = new Message(MessageType.COMPENSATION_CLAIMS, 
                                "This is Compensation claims message", "1234@metropolia.fi");

        Message message2 = new Message(MessageType.CONTACT_REQUEST, 
                                "This is Contact request message", "5678@metropolia.fi");

        Message message3 = new Message(MessageType.DEVELOPMENT_SUGGESTIONS, 
                                "This is Development suggestions message", "9012@metropolia.fi");

        Message message4 = new Message(MessageType.GENERAL_FEEDBACK, 
                                "This is General feedback message", "feedback@metropolia.fi");
                                
        Message message5 = new Message(null, 
                                "This is null message. Its should return a error", "null@metropolia.fi");
        
        Message message6 = new Message(MessageType.COMPENSATION_CLAIMS, 
                                "This is Compensation claims message, again", "1234@metropolia.fi");

        // Send chain message from the beginning
        claimHandler.handle(message1);
        claimHandler.handle(message2);
        claimHandler.handle(message3);
        claimHandler.handle(message4);
        claimHandler.handle(message5);
        claimHandler.handle(message6);

    }
}
