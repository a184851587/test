package interfaceTest;

public class Test {

    public static void main(String[] args) {

        EatService implA = new EatServiceImplA();

        EatService implB = new EatServiceImplB();

        implA.eat();
        implB.eat();

        //输出结果  吃苹果
        //         吃香蕉
    }
}
