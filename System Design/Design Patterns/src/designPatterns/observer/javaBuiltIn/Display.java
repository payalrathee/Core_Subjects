package designPatterns.observer.javaBuiltIn;

import java.util.Observable;
import java.util.Observer;

public class Display implements Observer {

    private float temp;
    private Observable observable;

    public Display(Observable o) {
        this.observable = o;
    }

    public void display() {
        System.out.println("Current Temp is: " + this.temp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherStation) {
            WeatherStation w = (WeatherStation) o;
            this.temp = w.getTemp();
        }
    }
}
