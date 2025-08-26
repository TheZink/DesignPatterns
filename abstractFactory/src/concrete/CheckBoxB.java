package src.concrete;
import src.Checkbox;

public class CheckBoxB extends Checkbox {

    public CheckBoxB(String text) {
        this.text = text;
    }
    
    public void display(){
        System.out.println("+------------------+\n" +
                            "Checkbox= " + text + "\n" +
                            "+------------------+\n");

    }


}
