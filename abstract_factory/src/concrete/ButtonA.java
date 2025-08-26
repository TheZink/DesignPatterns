package main.concrete;
import main.Button;

public class ButtonA extends Button {

    public ButtonA(String text) {
        this.text = text;
    }
    
    public void display(){
        System.out.println("+------------------+\n");

        System.out.println("Button= " + text + "\n");

        System.out.println("+------------------+\n");

    }

}
