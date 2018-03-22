import java.util.ArrayList;
import java.util.Iterator;
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


        Student stuA = new Student(1, "A", "M", 184);
        Student stuB = new Student(2, "B", "G", 163);
        Student stuC = new Student(3, "C", "M", 175);
        Student stuD = new Student(4, "D", "G", 158);
        Student stuE = new Student(5, "E", "M", 170);
        List<Student> list1 = new ArrayList<>();
        list1.add(stuA);
        list1.add(stuB);
        list1.add(stuC);
        list1.add(stuD);
        list1.add(stuE);


        Iterator<Student> iterator = list1.iterator();
        while(iterator.hasNext()) {
            Student stu = iterator.next();
            if (stu.getSex().equals("G")) {

                System.out.println(stu.toString());
            }
        }

        list1.stream()
                .filter(student -> student.getSex().equals("G"))
                .forEach(student -> System.out.println(student.toString()));


    }

}
