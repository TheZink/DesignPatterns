package observer;

import weatherstation.ObservableStation;

public class ObservingTemp implements Observer {
    private ObservableStation observable;

    public ObservingTemp(ObservableStation station){
        this.observable = station;
        observable.addObserver(this);
    }

    public void update(){
        System.out.println("Temperature has changed. Current temperature is " + 
        observable.getTemp() + " Celsius");
    }

}
