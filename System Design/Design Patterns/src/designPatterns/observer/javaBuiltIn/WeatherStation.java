package designPatterns.observer.javaBuiltIn;

import java.util.Observable;

public class WeatherStation extends Observable {

    private float temp;

    public WeatherStation() {

    }

    public void setWeather(float temp) {
        this.temp = temp;
        setChanged();
        notifyObservers();
    }

    public float getTemp() {
        return temp;
    }
}
