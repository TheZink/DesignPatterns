package weatherstation;

import java.util.ArrayList;
import java.util.Random;
import observer.Observer;

public class ObservableStation extends Observable implements Runnable{

    private int temp;
    private Random random = new Random();

    public ObservableStation(){
        this.temp = random.nextInt(0, 25);
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void setTemp(int change){
        this.temp = change;
    }

    public int getTemp(){
        return temp;
    }

    public void run(){

        while (true){
            // Randomize (0) add or (1) sub. 
            int stage = random.nextInt(0,2);

            // Add or sub temperature value
            switch (stage) {
                case 0: setTemp((getTemp() + 1)); break;
                case 1: setTemp((getTemp() - 1)); break;
            }

            // Notify change
            updateObserver();

            // Pause Thread for 3 seconds
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e){
                System.out.println("ERROR: Thread " + e);
            }
        }

    }
}
