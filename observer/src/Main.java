import observer.ObservingTemp;
import weatherstation.ObservableStation;

public class Main {
    public static void main(String[] args) {
        ObservableStation station = new ObservableStation();

        //Crete Observers
        ObservingTemp obs1 = new ObservingTemp(station);
        ObservingTemp obs2 = new ObservingTemp(station);
        ObservingTemp obs3 = new ObservingTemp(station);

        Thread thread = new Thread(station);
        thread.start();
    }

}
