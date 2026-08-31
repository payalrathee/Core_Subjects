package designPatterns.decorator;

public class HouseBlend implements Beverage{

    private String desc;

    public HouseBlend() {
        this.desc = "Here is your house blend";
    }

    @Override
    public void serve() {
        System.out.println(this.desc);
    }
}
