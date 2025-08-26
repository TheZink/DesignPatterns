package src;

public abstract class Button {

    protected String text;
    
    public void setText(String text) {
        this.text = text;
    }
    
    public abstract void display();

}
