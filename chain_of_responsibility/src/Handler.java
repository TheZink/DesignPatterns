public abstract class Handler {

    protected Handler next;

    public void setNextHandler(Handler next){
        this.next = next;
    }

    public void handle(Message message){

        // If handler can process the message-type, pass it to the handler.
        if (canProcess(message)){
            process(message);
        
        // Move to the next handler, if previous handler return false
        } else if (next != null){
            next.handle(message);

        // Throw an error, if handler not found
        } else {
            System.out.println("No hanlder found for message-type " + message.getType());
        }

    }

    public abstract boolean canProcess(Message message);
    public abstract void process(Message message);

}
