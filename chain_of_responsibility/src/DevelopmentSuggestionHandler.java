public class DevelopmentSuggestionHandler extends Handler {
    
    @Override
    public boolean canProcess(Message message){
        return message.getType() == MessageType.DEVELOPMENT_SUGGESTIONS;
    }

    @Override
    public void process(Message message){
        System.out.println("Processing message from:" + message.getSenderEmail() + "\n" + 
                            "Message type is: " + message.getType() + "\n" +
                            "Message content: " + message.getMessage() + "\n");
    }
}
