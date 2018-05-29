package exception;

public class Test {

    public static void main(String[] args) {

        try {
            System.out.println(100/0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("ssssssssssssssss");

        System.out.println("-----------------------");
    }
}
