package src.concrete;

import src.Button;
import src.Checkbox;
import src.TextField;
import src.UIFactory;

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
