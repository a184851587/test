package anonymousInnerClass;

public class Demo {

    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
            }
        };
        t.start();
    }
}
