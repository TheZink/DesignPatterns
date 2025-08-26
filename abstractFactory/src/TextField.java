package src;

public abstract class TextField {

    protected String text;
    
    public void setText(String text) {
        this.text = text;
    }
    
    public abstract void display();
}
