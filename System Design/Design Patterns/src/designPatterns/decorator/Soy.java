package designPatterns.decorator;

public class Soy implements Beverage{

    private String desc;
    private Beverage  beverage;

    public Soy(Beverage b) {
        this.desc = "Soy";
        this.beverage = b;
    }

    @Override
    public void serve() {
        beverage.serve();
        System.out.println("Added extra " + this.desc);
    }
}
