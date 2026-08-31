package designPatterns.strategy;

public abstract class Person {
    Movable movable;

    public void setMovable(Movable movable) {
        this.movable = movable;
    }

    public void move() {
        movable.move();
    }

}
