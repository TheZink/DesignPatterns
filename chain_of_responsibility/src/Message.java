public class Message {
    private MessageType type;
    private String message;
    private String senderEmail;

    public Message(MessageType type, String message, String senderEmail){
        this.type = type;
        this.message = message;
        this.senderEmail = senderEmail;
    }

    public MessageType getType(){
        return type;
    }

    public String getMessage(){
        return message;
    }

    public String getSenderEmail(){
        return senderEmail;
    }
}
