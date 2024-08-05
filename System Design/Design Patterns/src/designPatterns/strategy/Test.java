package designPatterns.strategy;

public class Test {
    public static void main(String[] args) {
        Person adult = new Adult();
        adult.move();

        Person child = new Child();
        child.move();

        System.out.println("Child started walking...");
        child.setMovable(new Walk());
        child.move();

        System.out.println("Adult started crawling... :)");
        adult.setMovable(new Crawl());
        adult.move();
    }
}
