package main.concrete;
import main.Checkbox;

public class CheckBoxA extends Checkbox {

    public CheckBoxA(String text) {
        this.text = text;
    }

    public void display(){
        System.out.println("+------------------+\n");

        System.out.println("CheckBox= " + text + "\n");

        System.out.println("+------------------+\n");


    }


}
