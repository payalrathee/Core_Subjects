package designPatterns.strategy;

public class Child extends Person{
    public Child() {
        movable = new Crawl();
        System.out.println("Child...");
    }
}
