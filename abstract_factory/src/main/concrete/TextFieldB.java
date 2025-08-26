package main.concrete;
import main.TextField;

public class TextFieldB extends TextField{

    public TextFieldB(String text) {
        this.text = text;
    }

    public void display(){
        System.out.println("+------------------+\n");

        System.out.println("TextField= " + text + "\n");

        System.out.println("+------------------+\n");
    }


}
