package designPatterns.observer;

import java.util.ArrayList;

public interface Subject {
    public void addObserver(Observer o);
    public void remObserver(Observer o);
    public void notifyObservers();
}
