package designPatterns.decorator;

public class Milk implements Beverage{

    private String desc;
    private Beverage  beverage;

    public Milk(Beverage b) {
        this.desc = "Milk";
        this.beverage = b;
    }

    @Override
    public void serve() {
        beverage.serve();
        System.out.println("Added extra " + this.desc);
    }
}
