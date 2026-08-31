package designPatterns.observer.javaBuiltIn;

public class Test {

    public static void main(String[] args) {
        WeatherStation w = new WeatherStation();
        Display d = new Display(w);
        w.addObserver(d);

        d.display();
        w.setWeather(12.23f);
        d.display();
    }
}
