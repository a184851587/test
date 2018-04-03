package Jdk8test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest {

    public static void main(String[] args) {

        //关于Lambda设计的讨论占用了大量的时间与社区的努力。可喜的是，
        // 最终找到了一个平衡点，使得可以使用一种即简洁又紧凑的新方式来构造Lambdas。
        // 在最简单的形式中，一个lambda可以由用逗号分隔的参数列表、
        // –>符号与函数体三部分表示。例如：

        Arrays.asList("a","b","c").forEach(a->{
            System.out.println(a);
        });

        List<Integer> listtest = new ArrayList();

        for (int i = 0; i <10 ; i++) {
            listtest.add(i);
        }


        String str="..";
        listtest.forEach(e-> System.out.println(e+str));


        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );

        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );
    }
}
