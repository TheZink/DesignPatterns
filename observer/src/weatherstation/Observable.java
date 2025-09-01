package weatherstation;

import java.util.ArrayList;
import java.util.List;
import observer.*;

public abstract class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public abstract void addObserver(Observer observer);

    public abstract void removeObserver(Observer observer);

    public void updateObserver(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
