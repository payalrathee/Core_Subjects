package designPatterns.strategy;

public class Walk implements Movable{
    @Override
    public void move() {
        System.out.println("Walking...");
    }
}
