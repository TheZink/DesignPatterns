package main;

import main.concrete.AFactory;
import main.concrete.BFactory;

public class Gui {

    public void start(){
        UIFactory factA = new AFactory();
        UIFactory factB = new BFactory();

        System.out.println("Starting programm.");

        Button buttonA = factA.createButton("Created buttonA");
        Checkbox checkBoxA = factA.createCheckBox("Created CheckboxA");
        TextField textFieldA = factA.createField("Created TextFieldA");

        buttonA.display();
        checkBoxA.display();
        textFieldA.display();

        Button buttonB = factB.createButton("Changed to buttonB");
        Checkbox checkBoxB = factB.createCheckBox("Changed to checkBoxB");
        TextField textFieldB = factB.createField("Changed to textFieldB");

        buttonB.display();
        checkBoxB.display();
        textFieldB.display();

        System.out.println("Ending programm");

    }

}
