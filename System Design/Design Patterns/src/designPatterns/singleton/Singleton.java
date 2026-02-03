package designPatterns.singleton;

public class Singleton {

    private static Singleton singleton;
    private String msg;

    private Singleton(String msg) {
        this.msg = msg;
    }

    public static Singleton getSingleton(String msg) {
        if(singleton == null) {
            singleton = new Singleton(msg);
        }
        return singleton;
    }

    public void display() {
        System.out.println(msg);
    }
}
