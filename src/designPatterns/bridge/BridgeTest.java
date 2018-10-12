package designPatterns.bridge;

public class BridgeTest {

    public static void main(String[] args) {

        AearA a = new AreaA1();
        a.bridge = new AreaB();
        a.fromA();
        a.bridge.toAreaB();
    }

}
