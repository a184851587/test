import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<String> list =new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(""+i);
        }

        list.stream().forEach(a->{
            System.out.println(a);
        });
    }
}
