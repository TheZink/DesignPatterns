package src.concrete;
import src.TextField;

public class TextFieldA extends TextField {

    public TextFieldA(String text) {
        this.text = text;
    }
    
    public void display(){
        System.out.println("+------------------+\n");

        System.out.println("TextField= " + text + "\n");

        System.out.println("+------------------+\n");

    }


}
