package generic;

public class Point<T> {
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public static void main(String[] args) {

        Point<Integer> integerPoint = new Point<>();
        integerPoint.setX(100);

        Point<Float> floatPoint = new Point<>();
        floatPoint.setX(2.0f);

        System.out.println("int"+integerPoint.getX()+"\n"+"float"+floatPoint.getX());



    }
}
