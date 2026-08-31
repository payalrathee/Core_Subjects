package designPatterns.singleton;

public class Test {
    public static void main(String[] args) {
        Singleton s = Singleton.getSingleton("I am singleton");
        s.display();
    }
}
