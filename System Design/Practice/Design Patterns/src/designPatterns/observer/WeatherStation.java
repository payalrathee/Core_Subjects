package designPatterns.observer;

import java.util.ArrayList;

public class WeatherStation implements Subject{

    float temp;
    float humidity;
    float pressure;

    ArrayList<Observer> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void remObserver(Observer o) {
        observers.remove(o);
    }

    public void setWeather(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(temp, humidity, pressure);
        }
    }
}
