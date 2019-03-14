import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class test {

    public static void main(String[] args) {

       /* System.out.println(BigDecimal.valueOf(-1));

        System.out.println(BigDecimal.ZERO);
        System.out.println( "分支测试+1");

        //dfsfsdfdsfds
       ///ssssssfeeeee
        System.out.println("加点东西");*/

        Set set = new HashSet();

        set.add("Bernadine");
        set.add("Elizabeth");
        set.add("Gene");
        set.add("Elizabeth");
        set.add("Clara");
        System.out.println(set);
        Set sortedSet = new TreeSet();


        sortedSet.add("Bernadine");
        sortedSet.add("Elizabeth");
        sortedSet.add("Gene");
        sortedSet.add("Elizabeth");
        sortedSet.add("Clara");
        sortedSet.add("里");
        sortedSet.add("1");
        System.out.println(sortedSet);


    }
}
