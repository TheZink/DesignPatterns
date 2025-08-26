package src.concrete;
import src.Button;

public class ButtonA extends Button {

    public ButtonA(String text) {
        this.text = text;
    }
    
    public void display(){
        System.out.println("+------------------+\n" +
                            "Button= " + text + "\n" +
                            "+------------------+\n");

    }

}
