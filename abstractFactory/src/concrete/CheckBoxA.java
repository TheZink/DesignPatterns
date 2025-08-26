package src.concrete;
import src.Checkbox;

public class CheckBoxA extends Checkbox {

    public CheckBoxA(String text) {
        this.text = text;
    }

    public void display(){
        System.out.println("+------------------+\n" +
                            "Checkbox= " + text + "\n" +
                            "+------------------+\n");

    }


}
