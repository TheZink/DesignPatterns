package src.concrete;
import src.TextField;

public class TextFieldB extends TextField{

    public TextFieldB(String text) {
        this.text = text;
    }

    public void display(){
        System.out.println("+------------------+\n" +
                            "Textfield= " + text + "\n" +
                            "+------------------+\n");
    }


}
