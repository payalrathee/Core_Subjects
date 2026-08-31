package designPatterns.strategy;

public class Adult extends Person{

    public Adult() {
        movable = new Walk();
        System.out.println("Adult...");
    }
}
