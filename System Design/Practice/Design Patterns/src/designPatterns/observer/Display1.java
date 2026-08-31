package designPatterns.observer;

public class Display1 implements Observer {

    float temp;
    float humidity;
    float pressure;

    Subject subject;

    public Display1(Subject subject){
        this.subject = subject;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void display() {
        System.out.println("Hi, I'm display 1");
        System.out.println(temp + " " + humidity + " " + pressure);
    }
}
