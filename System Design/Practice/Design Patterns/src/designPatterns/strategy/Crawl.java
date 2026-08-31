package designPatterns.strategy;

public class Crawl implements Movable{
    @Override
    public void move() {
        System.out.println("Crawling...");
    }
}
