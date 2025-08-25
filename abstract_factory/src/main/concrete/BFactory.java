package main.concrete;

import main.Button;
import main.Checkbox;
import main.TextField;
import main.UIFactory;

public class BFactory extends UIFactory {

    public Button createButton(String text){
        return new ButtonB(text);
    }

    public Checkbox createCheckBox(String text){
        return new CheckBoxB(text);
    }

    public TextField createField(String text){
        return new TextFieldB(text);
    }
}
