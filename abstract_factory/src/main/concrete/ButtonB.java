package main.concrete;
import main.Button;

public class ButtonB extends Button{

    public ButtonB(String text) {
        this.text = text;
    }
    
    public void display(){
        System.out.println("+------------------+\n");

        System.out.println("Button= " + text + "\n");

        System.out.println("+------------------+\n");

    }


}
