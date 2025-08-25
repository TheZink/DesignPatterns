package main.concrete;

import main.Button;
import main.Checkbox;
import main.TextField;
import main.UIFactory;

public class AFactory extends UIFactory {

    public Button createButton(String text){
        return new ButtonA(text);
    }

    public Checkbox createCheckBox(String text){
        return new CheckBoxA(text);
    }

    public TextField createField(String text){
        return new TextFieldA(text);
    }
}
