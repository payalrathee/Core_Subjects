package designPatterns.decorator;

public class Test {

    public static void main(String[] args) {
        // Espresso with milk and soy
        Beverage b1 = new Soy(new Milk(new Espresso()));
        b1.serve();

        System.out.println();

        // HouseBlend with milk
        Beverage b2 = new Milk(new HouseBlend());
        b2.serve();
    }
}
