package designPatterns.decorator;

public class Espresso implements Beverage{

    private String desc;

    public Espresso() {
        this.desc = "Here is your espresso";
    }

    @Override
    public void serve() {
        System.out.println(this.desc);
    }

}
