package designPatterns.observer;

public class Test {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Display1 d1 = new Display1(station);
        Display2 d2 = new Display2(station);

        station.addObserver(d1);
        station.addObserver(d2);

        d1.display();
        d2.display();

        station.setWeather(1,2,3);

        d1.display();
        d2.display();
    }


}
