package src.concrete;
import src.Button;

public class ButtonB extends Button{

    public ButtonB(String text) {
        this.text = text;
    }
    
    public void display(){
        System.out.println("+------------------+\n" +
                            "Button= " + text + "\n" +
                            "+------------------+\n");
    }


}
