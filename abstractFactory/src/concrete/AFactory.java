package src.concrete;

import src.Button;
import src.Checkbox;
import src.TextField;
import src.UIFactory;

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
